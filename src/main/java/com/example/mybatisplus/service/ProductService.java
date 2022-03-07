package com.example.mybatisplus.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.model.domain.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatisplus.model.dto.PageDTO;
import com.example.mybatisplus.model.dto.ProductDTO;
import com.example.mybatisplus.vo.ProductVO;

/**
 * <p>
 * 衣服款式表 服务类
 * </p>
 *
 * @author jxh
 * @since 2022-02-23
 */
public interface ProductService extends IService<Product> {

    void insert(ProductDTO productDTO);

    Page<ProductVO> pVOlist(PageDTO pageDTO, Product product);
}
