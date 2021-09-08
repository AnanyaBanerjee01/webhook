package com.hyland.webhook.filter;

import com.hyland.webhook.constants.WebHookConstants;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
public class HeaderValidatorFilter extends OncePerRequestFilter {

    @Value("${zoom.verification.token}")
    private String verificationToken;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String path = request.getRequestURI();
        log.info("#### path {} ##### ", path);
        if ("/api/webhook/fetch".equals(path)) {
            filterChain.doFilter(request, response);
            return;
        }
        String authToken = request.getHeader(WebHookConstants.AUTHORIZATION);
        log.info("#### validateToken {} ##### ", authToken);

        if (null != authToken && !authToken.equals(verificationToken)) {
            response.sendError(HttpStatus.FORBIDDEN.value(), "Invalid Verification Token");
            log.debug("Invalid Verification Token");
            return;
        }

        filterChain.doFilter(request, response);
    }
}
