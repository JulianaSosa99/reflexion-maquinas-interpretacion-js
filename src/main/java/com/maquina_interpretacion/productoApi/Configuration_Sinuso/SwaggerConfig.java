/*package com.maquina_interpretacion.productoApi.Configuration;
//comento ya que no servia y decidi dejarlo para mejorarloo luego
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springdoc.core.GroupedOpenApi;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("productoApi")
                .pathsToMatch("/api/**")
                .build();
    }
}
*/