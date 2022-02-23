package com.example.mybatisplus.service.impl;

import com.example.mybatisplus.model.domain.ProductImage;
import com.example.mybatisplus.mapper.ProductImageMapper;
import com.example.mybatisplus.service.ProductImageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品图片表 服务实现类
 * </p>
 *
 * @author jxh
 * @since 2022-02-23
 */
@Service
public class ProductImageServiceImpl extends ServiceImpl<ProductImageMapper, ProductImage> implements ProductImageService {

}
