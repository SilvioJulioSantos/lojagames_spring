package com.generationmeli.lojagames.repository;


import com.generationmeli.lojagames.model.Categoria;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
// classe

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

     List<Categoria> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);

}
