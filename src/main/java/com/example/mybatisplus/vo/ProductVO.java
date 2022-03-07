package com.example.mybatisplus.vo;/**
 * @author by JXH
 * @date 2022/2/24.
 * @Description
 */

import com.example.mybatisplus.model.domain.Product;
import com.example.mybatisplus.model.domain.ProductImage;
import lombok.Data;

import java.util.List;

/**
 * mybatisplus
 * Product传输对象
 * @author : 你的名字
 * @date : 2022-02-24 09:06
 **/
@Data
public class ProductVO extends Product {
    private List<ProductImage> images;

    public ProductVO(){}

    public ProductVO(Product product) {
        super(product);
    }
}
