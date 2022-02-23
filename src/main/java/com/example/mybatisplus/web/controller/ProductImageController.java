package com.example.mybatisplus.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.mybatisplus.common.JsonResponse;
import com.example.mybatisplus.service.ProductImageService;
import com.example.mybatisplus.model.domain.ProductImage;


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
@RequestMapping("/productImage")
public class ProductImageController {

    private final Logger logger = LoggerFactory.getLogger( ProductImageController.class );

    @Autowired
    private ProductImageService productImageService;

}

