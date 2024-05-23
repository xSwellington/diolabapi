package dev.swellington.diolabapi.configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("DioLab API")
                                .version("1.0")
                                .description("Api de encurtar URL")
                                .contact(new Contact()
                                        .name("Su'el")
                                        .email("swellington.santos@gmail.com"))
                );
    }
}
