package com.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.model.domain.BatchSetting;
import com.example.mybatisplus.mapper.BatchSettingMapper;
import com.example.mybatisplus.model.dto.PageDTO;
import com.example.mybatisplus.service.BatchSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 批次设定 服务实现类
 * </p>
 *
 * @author jxh
 * @since 2022-02-17
 */
@Service
public class BatchSettingServiceImpl extends ServiceImpl<BatchSettingMapper, BatchSetting> implements BatchSettingService {

    @Override
    public Page<BatchSetting> pageList(PageDTO page, String batchName) {
        Page<BatchSetting> batchSettingPage = new Page<>(page.getPageNo(), page.getPageSize());
        if(StringUtils.isNotBlank(batchName)) {
            LambdaQueryWrapper<BatchSetting> wrapper = new LambdaQueryWrapper<>();
            wrapper.like(BatchSetting::getName, batchName);
            batchSettingPage = baseMapper.selectPage(batchSettingPage, wrapper);
        } else {
            batchSettingPage = baseMapper.selectPage(batchSettingPage, null);
        }
        return batchSettingPage;
    }
}
