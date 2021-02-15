package br.com.alura.mvc.mudi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.mudi.interceptor.Acesso;
import br.com.alura.mvc.mudi.repository.AcessoRepository;

@RequestMapping("acessos")
@RestController
public class AcessoRest {

	@Autowired
	private AcessoRepository acessoRepository;
	
	@GetMapping
	public List<Acesso> getAcessos() {
		
		return acessoRepository.findAll();
	}
}
