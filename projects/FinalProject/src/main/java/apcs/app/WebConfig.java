//needed to allow CORS requests from the frontend to the backend
//need to allow GitHub Pages frontend to call Spring Boot backend
//browsers usually block requests from one website to another unless CORS allows it
//chatgpt generated this code for me

package apcs.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("https://danielwang321.github.io")
                .allowedMethods("GET", "POST", "OPTIONS")
                .allowedHeaders("*");
    }
}