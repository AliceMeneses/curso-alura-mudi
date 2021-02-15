package br.com.alura.mvc.mudi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import br.com.alura.mvc.mudi.interceptor.InterceptadorDeAcessos;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
	
	@Autowired
	private InterceptadorDeAcessos interceptadorDeAcessos;
	
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(interceptadorDeAcessos).addPathPatterns("/**");
	}
}
