package com.example.mybatisplus.model.dto;/**
 * @author by JXH
 * @date 2022/2/23.
 * @Description
 */

import com.example.mybatisplus.model.domain.Product;
import com.example.mybatisplus.model.domain.ProductImage;
import lombok.Data;

import java.util.List;

/**
 * mybatisplus
 * 传输的对象
 * @author : 你的名字
 * @date : 2022-02-23 09:49
 **/
@Data
public class ProductDTO extends Product {
    private List<String> size;
    private List<ProductImage> imgs;

}
