package com.example.swag.controller;

import com.example.swag.model.Produto;
import com.example.swag.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @brief Controlador REST para gerenciar operações relacionadas a produtos.
 * Este controlador fornece endpoints para listar, buscar, criar, atualizar e deletar produtos.
 */
@RestController
@RequestMapping()
public class ProdutoController {

    /**
     * @brief Serviço responsável por executar as operações de negócio relacionadas aos produtos.
     */
    @Autowired
    private ProdutoService produtoService;

    /**
     * @brief Lista todos os produtos cadastrados.
     * @return Uma lista contendo todos os produtos registrados.
     */
    @GetMapping("Listar Produtos")
    public List<Produto> listar() {
        return produtoService.listarTodos();
    }

    /**
     * @brief Busca um produto específico pelo ID.
     * @param id O identificador único do produto a ser buscado.
     * @return O produto correspondente ao ID fornecido, ou um status 404 caso não seja encontrado.
     */
    @GetMapping("Buscar Produto/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return produtoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * @brief Cadastra um novo produto.
     * @param produto O objeto contendo os detalhes do produto a ser criado.
     * @return O produto recém-criado com um status 201 (Created).
     */
    @PostMapping("Cadastrar Produto")
    public ResponseEntity<Produto> criar(@RequestBody Produto produto) {
        Produto novoProduto = produtoService.salvar(produto);
        return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);
    }

    /**
     * @brief Atualiza as informações de um produto existente.
     * @param id O identificador do produto a ser atualizado.
     * @param produto O objeto contendo as novas informações do produto.
     * @return O produto atualizado, ou um status 404 caso o produto não seja encontrado.
     */
    @PutMapping("Atualizar/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.buscarPorId(id)
                .map(produtoExistente -> {
                    produto.setId(id);
                    Produto produtoAtualizado = produtoService.salvar(produto);
                    return new ResponseEntity<>(produtoAtualizado, HttpStatus.OK);
                }).orElse(ResponseEntity.notFound().build());
    }

    /**
     * @brief Deleta um produto existente pelo ID.
     * @param id O identificador do produto a ser deletado.
     * @return Um status 204 (No Content) caso a exclusão seja bem-sucedida, ou 404 se o produto não for encontrado.
     */
    @DeleteMapping("Deletar Produto/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (produtoService.buscarPorId(id).isPresent()) {
            produtoService.deletar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
