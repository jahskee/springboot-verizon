package com.jahskee.verizonlabs.config;

import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	
	
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	
    	registry.addViewController("/auth/login").setViewName("/auth/login");
    	//  registry.addViewController("/account/page1").setViewName("/account/page1");
        
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
          //registry.addResourceHandler("/**").addResourceLocations("file://home/releasemgr/workspace/verizonlabs/public").setCachePeriod(31556926);
      
    }
   

}