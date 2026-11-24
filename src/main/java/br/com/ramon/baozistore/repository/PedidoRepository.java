package br.com.ramon.baozistore.repository;

import br.com.ramon.baozistore.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}