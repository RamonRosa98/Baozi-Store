package br.com.ramon.baozistore.repository;

import br.com.ramon.baozistore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}