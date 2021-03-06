package com.spring.test.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

public class CustomFilter extends UsernamePasswordAuthenticationFilter {

    public CustomFilter (String urlLogin, String method) {
        setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher(urlLogin, method));
    }


    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        // do your stuff ...

        return super.attemptAuthentication(request, response);
    }
}