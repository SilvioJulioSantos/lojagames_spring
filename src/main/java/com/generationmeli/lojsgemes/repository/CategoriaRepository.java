package com.generationmeli.lojsgemes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository<Categoria> extends JpaRepository<Categoria, Long> {

    public List<Categoria> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);

}