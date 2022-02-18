package com.example.mybatisplus.common.interceptor;

import com.example.mybatisplus.common.utls.SessionUtils;
import com.example.mybatisplus.model.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            //统一拦截（查询当前session是否存在user）(这里user会在每次登陆成功后，写入session)
            User user = SessionUtils.getCurrentUser();
            if(Objects.nonNull(user)){
                return true;
            }
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
