package com.example.mybatisplus.service;

import com.example.mybatisplus.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 学校用户白名单设置 服务类
 * </p>
 *
 * @author jxh
 * @since 2022-02-17
 */
public interface UserService extends IService<User> {
    public User login(User user);
}
