package org.wcf.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.wcf.demo.Interceptor.UserLoginHandlerInterceptor;

/**
 * 自定义SpringMVC的配置
 * 有些时候我们需要自己配置SpringMVC而不是采用默认，比如增加一个拦截器，这个时候就得通过继承WebMvcConfigureAdapter 然后重写父类中的方法进行扩展
 */
@SpringBootConfiguration
public class MvcConfig  implements WebMvcConfigurer {
    @Autowired
    private UserLoginHandlerInterceptor userLoginHandlerInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userLoginHandlerInterceptor).addPathPatterns("/api/user/**");
    }

    /**
     * 跨域全局配置
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/api/**").allowedOrigins("http://localhost:8080");
    }
}
