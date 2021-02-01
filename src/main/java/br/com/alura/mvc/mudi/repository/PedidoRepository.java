package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;
import br.com.alura.mvc.mudi.model.User;

public interface PedidoRepository  extends JpaRepository<Pedido, Long>{

	List<Pedido> findByStatus(StatusPedido status);
	
	List<Pedido> findByUser(User user);

}
