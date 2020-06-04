package com.example.config;

import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Jasper Wu
 * @date 2020/6/4
 **/
public class MyWebAuthenticationDetails extends WebAuthenticationDetails {
    private boolean isPassed;

    public MyWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
        String code = request.getParameter("code");
        String verifyCode = (String) request.getSession().getAttribute("verify_code");
        if (code != null && code.equals(verifyCode)) {
            isPassed = true;
        }
    }

    public boolean isPassed() {
        return isPassed;
    }
}
