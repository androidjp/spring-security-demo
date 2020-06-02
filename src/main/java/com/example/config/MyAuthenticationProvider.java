package com.example.config;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Jasper Wu
 * @date 6/2/2020
 **/
public class MyAuthenticationProvider extends DaoAuthenticationProvider {
    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        // 获取当前请求
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        // 获取到验证码（当前请求中的code参数）
        String code = request.getParameter("code");
        // 从session中生成验证码字符串
        String verifyCode = (String) request.getSession().getAttribute("verify_code");
        // 比较，有问题，抛异常
        if (code == null || !code.equals(verifyCode)) {
            throw new AuthenticationServiceException("验证码错误");
        }
        // 调用父类方法，做密码校验
        super.additionalAuthenticationChecks(userDetails, authentication);
    }
}
