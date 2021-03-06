package com.csfrez.demo.locale;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class CustomLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String paramLanguage = request.getParameter("lang");
        if (!StringUtils.isEmpty(paramLanguage)) {
            String[] splits = paramLanguage.split("_");
            return new Locale(splits[0], splits[1]);
        } else {
            String acceptLanguage = request.getHeader("Accept-Language").split(",")[0];
            String[] splits = acceptLanguage.split("-");
            return new Locale(splits[0], splits[1]);
        }
        // 如果想使用当前系统的语言，则使用Locale.getDefault()
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}