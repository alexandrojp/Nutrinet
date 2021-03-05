package com.bitware.nutrinet.api;

import com.bitware.nutrinet.api.filter.ResponseApiFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<ResponseApiFilter> responseFilter() {
        FilterRegistrationBean<ResponseApiFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new ResponseApiFilter());
        registrationBean.addUrlPatterns("/Nutrinet/*");
        return registrationBean;
    }
}
