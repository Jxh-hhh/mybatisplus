package com.example.mybatisplus.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.mybatisplus.common.JsonResponse;
import com.example.mybatisplus.service.DictionaryService;
import com.example.mybatisplus.model.domain.Dictionary;

import java.util.List;


/**
 *
 *  前端控制器
 *
 *
 * @author jxh
 * @since 2022-02-19
 * @version v1.0
 */
@RestController
@RequestMapping("/dictionary")
public class DictionaryController {

    private final Logger logger = LoggerFactory.getLogger( DictionaryController.class );

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/{type}")
    public JsonResponse getItemsByType(@PathVariable("type") String type) {
        List<Dictionary> list = dictionaryService.getItemsByType(type);
        return JsonResponse.success(list);
    }
}

