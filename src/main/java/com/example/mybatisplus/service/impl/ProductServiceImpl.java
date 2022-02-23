package com.example.mybatisplus.service.impl;

import com.example.mybatisplus.model.domain.Product;
import com.example.mybatisplus.mapper.ProductMapper;
import com.example.mybatisplus.model.domain.ProductImage;
import com.example.mybatisplus.model.domain.Sku;
import com.example.mybatisplus.model.dto.ProductDTO;
import com.example.mybatisplus.service.ProductImageService;
import com.example.mybatisplus.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 衣服款式表 服务实现类
 * </p>
 *
 * @author jxh
 * @since 2022-02-23
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Autowired
    ProductImageService productImageService;

    @Autowired
    SkuService skuService;


    @Override
    @Transactional
    public void insert(ProductDTO productDTO) {
        //操作三张表，要加入事务
        baseMapper.insert(productDTO);
        productDTO.getImgs().stream().forEach(x -> x.setProductId(productDTO.getId()));
        List<Sku> collect = productDTO.getSize().stream()
                .map(x -> new Sku().setProductId(productDTO.getId()).setName(x)).collect(Collectors.toList());
        productImageService.saveBatch(productDTO.getImgs());
        skuService.saveBatch(collect);
    }
}
