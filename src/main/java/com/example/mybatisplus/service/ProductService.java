package com.example.mybatisplus.service;

import com.example.mybatisplus.model.domain.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatisplus.model.dto.ProductDTO;

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
}
