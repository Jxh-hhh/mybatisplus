package com.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.mybatisplus.model.domain.Dictionary;
import com.example.mybatisplus.mapper.DictionaryMapper;
import com.example.mybatisplus.service.DictionaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 数据字典 服务实现类
 * </p>
 *
 * @author jxh
 * @since 2022-02-19
 */
@Service
public class DictionaryServiceImpl extends ServiceImpl<DictionaryMapper, Dictionary> implements DictionaryService {

    @Override
    public List<Dictionary> getItemsByType(String type) {
        LambdaQueryWrapper<Dictionary> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Dictionary::getType, type)
                .ne(Dictionary::getParentId, 0);
        List<Dictionary> dictionaries = baseMapper.selectList(wrapper);
        return dictionaries;
    }
}
