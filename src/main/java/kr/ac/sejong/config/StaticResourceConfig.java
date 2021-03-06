package kr.ac.sejong.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticResourceConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/bower_components/**")
                .addResourceLocations("/resources/bower_components/")
                .setCachePeriod(20);

        registry.addResourceHandler("/plugins/**")
                .addResourceLocations("/resources/plugins/")
                .setCachePeriod(20);

        registry.addResourceHandler("/dist/**")
                .addResourceLocations("/resources/dist/")
                .setCachePeriod(20);

        registry.addResourceHandler("/track_js/**")
                .addResourceLocations("/resources/track_js/")
                .setCachePeriod(20);
    }
}

