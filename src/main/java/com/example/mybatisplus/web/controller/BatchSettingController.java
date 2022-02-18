package com.example.mybatisplus.web.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.model.dto.PageDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.mybatisplus.common.JsonResponse;
import com.example.mybatisplus.service.BatchSettingService;
import com.example.mybatisplus.model.domain.BatchSetting;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


/**
 *
 *  前端控制器
 *
 *
 * @author jxh
 * @since 2022-02-17
 * @version v1.0
 */
@RestController
@RequestMapping("/batchSetting")
public class BatchSettingController {

    private final Logger logger = LoggerFactory.getLogger( BatchSettingController.class );

    @Autowired
    private BatchSettingService batchSettingService;


    /**
     * 默认搜索所有batch，batchName不为空时，搜索与batchName类似的batch
     * @param page 分页对象
     * @param batchName 如第一行
     * @return 返回json数据
     */
    @RequestMapping("/list")
    public JsonResponse getBatchList(PageDTO page, String batchName) {
        Page<BatchSetting> list = batchSettingService.pageList(page, batchName);
        return JsonResponse.success(list);
    }

    /**
     * 新建batch
     * @param batchSetting 新建batch的信息
     * @return
     */
    @PostMapping("/save")
    public JsonResponse saveOneBatch(BatchSetting batchSetting){
        boolean save = batchSettingService.save(batchSetting);
        return JsonResponse.success(save);
    }

    /**
     * 删除一个batch
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public JsonResponse deleteOneBatch(@PathVariable("id") String id) {
        return JsonResponse.success(batchSettingService.removeById(id));
    }

    /**
     * 删除选中的batch
     * @param ids 返回的id数组
     * @return
     */
    @DeleteMapping("/deletes")
    public JsonResponse deleteChosenBatch(@RequestParam("ids[]") List<Long> ids) {
        return JsonResponse.success(batchSettingService.removeByIds(ids));
    }

}

