package com.example.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
//import springfox.documentation.swagger2.annotations.EnableOpenApi; // Remplacez par @EnableOpenApi
@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.controller")) // Remplacez par le package de vos contrôleurs
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Titre de votre API")
            .description("Description de votre API")
            .version("1.0")
            .build();
    }
}
*/
