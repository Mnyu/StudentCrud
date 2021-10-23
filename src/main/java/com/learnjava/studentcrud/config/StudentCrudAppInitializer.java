package com.learnjava.studentcrud.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentCrudAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] configFiles = new Class[]{StudentCrudAppConfig.class};
        return configFiles;
    }

    @Override
    protected String[] getServletMappings() {
        String[] mappings = new String[]{"/"};
        return mappings;
    }
}
