package com.generationmeli.lojsgemes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoriaRepository<Categoria> extends JpaRepository<Categoria, Long> {

    public List<Categoria> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);

}