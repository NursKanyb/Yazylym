package com.any.Any.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
public class MvcConfig {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/authPage").setViewName("authPage");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
