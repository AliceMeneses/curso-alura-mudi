package br.com.alura.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.mvc.mudi.interceptor.Acesso;

public interface AcessoRepository extends JpaRepository<Acesso, Long>{

}
