package com.views.filterinterceptor;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

@Component
public class DawsonApiFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        if (req.getHeader("x-dawson-nonce") == null || req.getHeader("x-dawson-signature") == null) {
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpResponse.setContentType("application/json");
            httpResponse.sendError(HttpServletResponse.SC_BAD_REQUEST, "Required headers not specified in the request");
            return;
        }
        chain.doFilter(request, response);
    }
}