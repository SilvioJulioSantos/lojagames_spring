package com.generationmeli.lojsgemes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
@Repository
public interface ProdutoRepository<Produto> extends JpaRepository<Produto, Long> {
    // Novos testes
    public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

    public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);

    public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}
