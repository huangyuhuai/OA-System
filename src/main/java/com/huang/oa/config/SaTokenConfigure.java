package com.huang.oa.config;


import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class SaTokenConfigure implements WebMvcConfigurer {
    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册 Sa-Token 拦截器，校验规则为 StpUtil.checkLogin() 登录校验。
        registry.addInterceptor(new SaInterceptor(handle -> StpUtil.checkLogin()))
                .addPathPatterns("/**")
                .excludePathPatterns("/api/login","/api/register")
                .excludePathPatterns(// knife4j文档地址
                        "/doc.html",
                        // swagger-ui, 没必要放开
                        "/swagger-ui/**",
                        // webjars
                        "/webjars/**",
                        // api
                        "/v3/api-docs/**",
                        // 我的习惯, 方便调试, 你可以不用
                        "/error");

    }


}
