package br.com.ramon.baozistore.repository;

import br.com.ramon.baozistore.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}