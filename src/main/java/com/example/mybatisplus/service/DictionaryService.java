package com.example.mybatisplus.service;

import com.example.mybatisplus.model.domain.Dictionary;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author jxh
 * @since 2022-02-19
 */
public interface DictionaryService extends IService<Dictionary> {

    List<Dictionary> getItemsByType(String type);
}
