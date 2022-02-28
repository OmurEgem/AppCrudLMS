package com.peaksoft.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ConfigDispatcherServletInitialazer extends AbstractAnnotationConfigDispatcherServletInitializer {
    // getRootConfigClasses (), возвращенный класс с аннотацией @Configuration будет использоваться для настройки bean-компонентов в контексте приложения, созданном ContextLoaderListener.
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }
    // getServletConfigClasses () возвращает компонент с аннотацией @Configuration, которая будет использоваться для определения контекста приложения DispatcherServlet.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcConfig.class};
    }
    // Он отобразит один или несколько путей к DispatcherServlet
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
