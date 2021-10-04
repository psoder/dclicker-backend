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
				registry.addMapping("/counter/**").allowedOrigins("https://clicker.psoder.net");
				registry.addMapping("/counter/**").allowedOrigins("*");
				registry.addMapping("/counter/").allowedOrigins("*");
				registry.addMapping("/counter/").allowedOrigins("https://10.179.121.88:9000");
				registry.addMapping("/counter/").allowedOrigins("https://172.18.188.255:3000");
				registry.addMapping("/counter/").allowedOrigins("https://localhost:3000");
			}
		};
	}

}
