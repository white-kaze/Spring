package com.kaze.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;


//    简写
public class ServiceInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
//    Spring容器
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

//    SpringMvc容器
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

//    由SpringMvc处理的请求
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

//    乱码处理

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter=new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}


//    详细写法
//public class ServiceInitConfig extends AbstractDispatcherServletInitializer {
////    加载SpringMvc容器对象
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx =new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringMvcConfig.class);
//        return ctx;
//    }
//
////    设置哪些请求归属SpringMvc处理
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
////    加载Spring容器对象
//    protected WebApplicationContext createRootApplicationContext() {
//        return null;
//    }
//}
