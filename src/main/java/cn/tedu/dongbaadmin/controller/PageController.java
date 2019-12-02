package cn.tedu.dongbaadmin.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@Configuration
public class PageController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("starter");
        registry.addViewController("/doPageUI").setViewName("common/page");
        registry.addViewController("/login").setViewName("login");
    }

    @RequestMapping("/{module}/{moduleUI}")
    public String getModuleUI(@PathVariable String moduleUI) {
        return "sys/" + moduleUI;
    }

}
