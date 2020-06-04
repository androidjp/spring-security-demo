package com.example.service;

import com.example.config.MyWebAuthenticationDetails;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Service;

/**
 * @author Jasper Wu
 * @date 2020/6/4
 **/
@Service
public class UserIPService {
    public String getUserIP() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        WebAuthenticationDetails details = (WebAuthenticationDetails) authentication.getDetails();
        if (details instanceof MyWebAuthenticationDetails) {
            MyWebAuthenticationDetails myDetails = (MyWebAuthenticationDetails) details;
            return myDetails.toString() + ", 认证通过？" + myDetails.isPassed();
        }
        return details.toString();
    }
}
