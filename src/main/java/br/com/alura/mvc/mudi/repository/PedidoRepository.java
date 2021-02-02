package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;
import br.com.alura.mvc.mudi.model.User;

public interface PedidoRepository  extends JpaRepository<Pedido, Long>{

	List<Pedido> findByStatus(StatusPedido status);
	
	List<Pedido> findByUser(User user);

	@Query("SELECT p FROM Pedido p JOIN p.user u WHERE u.username = :username and p.status = :status")
	List<Pedido> findByStatusAndUser(StatusPedido status, @Param("username") String username);

}
