package sloth.zhang.springbootswagger2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 9:42 2019/8/6
 * @Modificd By;
 */

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket controllerApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                .title("标题：用户信息管理系统——接口文档")
                .description("描述：用于管理公司的人员信息")
                .contact(new Contact("一只袜子",null,null))
                .version("版本号：1.0")
                .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("sloth.zhang.springbootswagger2"))
                .paths(PathSelectors.any())
                .build();
    }

}
