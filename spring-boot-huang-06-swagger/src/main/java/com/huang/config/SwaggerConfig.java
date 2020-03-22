package com.huang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @EnableSwagger2  开启Swagger功能
 * */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 使用swagger需要创建一个摘要    Docket
     * 参数
     *      文档类型    DocumentationType.SWAGGER_2
     *      文档通过一系列选择器组成    api path
     *      select()选择器
     *      apis()  生成哪些Controller的接口
     *              RequestHandlerSelectors.any()获取所有
     *              RequestHandlerSelectors.basePackage("com.huang.controller")获取包内
     *      path()  在查找出来的接口中进行筛选 */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.huang.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }
    //自定义文档的介绍
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("spring-boot-huang-06-swagger")
                .description("这是huang的swagger demo")
                .version("1.0")
                .build();
    }

}
