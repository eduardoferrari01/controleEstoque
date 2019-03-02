package br.com.estoque;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("br.com.estoque")).build().apiInfo(metaData());
  }

  private ApiInfo metaData() {
    return new ApiInfoBuilder().title("Estoque API")
        .contact(new Contact("Eduardo de Godoy Ferrari", "https://github.com/eduardoferrari01",
            "eduardo.gf@outlook.com.br"))
        .description(" Esta api tem por objetivo controlar o estoque").version("1.0.0").build();

  }
}
