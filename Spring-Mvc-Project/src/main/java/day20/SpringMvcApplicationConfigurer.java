package day20;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class SpringMvcApplicationConfigurer implements WebMvcConfigurer {
@Bean
public ViewResolver myViewResolver() {
	String prefix="/views/";
	String suffix=".jsp";
	InternalResourceViewResolver vr=new InternalResourceViewResolver(prefix,suffix);
	return vr;
}
}
