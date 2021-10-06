package counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://clicker.psoder.net");
				registry.addMapping("/counter/update").allowedOrigins("https://clicker.psoder.net");
				registry.addMapping("/**").allowedOrigins("https://ddagen.se/");
				registry.addMapping("/counter/update").allowedOrigins("https://ddagen.se/");				
			}
		};
	}

}
