package com.example.aggim.config

import com.example.aggim.interceptor.TokenValidationInterceptor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig @Autowired constructor(
    private val tokenValidationInterceptor: TokenValidationInterceptor
) : WebMvcConfigurer {

    override fun addResourceHandlers(
        registry: ResourceHandlerRegistry
    ) {
        registry.addResourceHandler("/images/**")
            .addResourceLocations("file:///aggim/images/")
    }

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(tokenValidationInterceptor)
            .addPathPatterns("/api/**")
    }

}