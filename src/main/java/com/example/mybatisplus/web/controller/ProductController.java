package com.example.mybatisplus.web.controller;

import com.example.mybatisplus.model.dto.ProductDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.mybatisplus.common.JsonResponse;
import com.example.mybatisplus.service.ProductService;
import com.example.mybatisplus.model.domain.Product;


/**
 *
 *  前端控制器
 *
 *
 * @author jxh
 * @since 2022-02-23
 * @version v1.0
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    private final Logger logger = LoggerFactory.getLogger( ProductController.class );

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public JsonResponse save(@RequestBody ProductDTO productDTO){
        productService.insert(productDTO);
        return JsonResponse.success(null);
    }

}

