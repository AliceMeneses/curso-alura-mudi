package br.com.alura.mvc.mudi.interceptor;

import java.time.Duration;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import br.com.alura.mvc.mudi.repository.AcessoRepository;

@Component
public class InterceptadorDeAcessos implements HandlerInterceptor {
	
	@Autowired
	private AcessoRepository acessoRepository;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		Acesso acesso = new Acesso();
		
		acesso.setData(LocalDateTime.now());
		acesso.setPath(request.getRequestURI());
	
		request.setAttribute("acesso", acesso);
		
		return true;
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		Acesso acesso = (Acesso) request.getAttribute("acesso");
		acesso.setDuracao(Duration.between(acesso.getData(), LocalDateTime.now()));

		acessoRepository.save(acesso);
	}

	
}
