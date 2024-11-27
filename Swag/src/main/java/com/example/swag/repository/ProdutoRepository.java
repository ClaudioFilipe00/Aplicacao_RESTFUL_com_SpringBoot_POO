package com.example.swag.repository;

import com.example.swag.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @brief Repositório responsável pelas operações de persistência da entidade Produto.
 * Extende JpaRepository para fornecer operações CRUD e consultas personalizadas.
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findById(Long id);
}

