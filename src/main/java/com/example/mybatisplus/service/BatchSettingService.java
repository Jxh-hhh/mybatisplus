package com.example.mybatisplus.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.model.domain.BatchSetting;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatisplus.model.dto.PageDTO;

/**
 * <p>
 * 批次设定 服务类
 * </p>
 *
 * @author jxh
 * @since 2022-02-17
 */
public interface BatchSettingService extends IService<BatchSetting> {

    Page<BatchSetting> pageList(PageDTO page, String batchName);
}
