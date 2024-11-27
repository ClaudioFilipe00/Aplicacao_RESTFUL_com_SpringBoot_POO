package com.example.swag.service;

import com.example.swag.model.Produto;
import com.example.swag.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @brief Serviço responsável pela lógica de negócio relacionada aos produtos.
 * Contém métodos para listar, buscar, salvar e deletar produtos.
 */
@Service
public class ProdutoService {

    /**
     * @brief Repositório responsável pelas operações de persistência da entidade Produto.
     */
    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * @brief Lista todos os produtos cadastrados no sistema.
     * @return Uma lista contendo todos os produtos.
     */
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    /**
     * @brief Busca um produto pelo seu identificador único (ID).
     * @param id O identificador único do produto a ser buscado.
     * @return Um Optional contendo o produto, caso encontrado, ou vazio caso não exista.
     */
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    /**
     * @brief Salva um novo produto ou atualiza um produto existente.
     * @param produto O produto a ser salvo ou atualizado.
     * @return O produto salvo ou atualizado.
     */
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    /**
     * @brief Deleta um produto pelo seu identificador único (ID).
     * @param id O identificador do produto a ser deletado.
     */
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}

