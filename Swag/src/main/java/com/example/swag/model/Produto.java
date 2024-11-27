package com.example.swag.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @brief Representa a entidade Produto no sistema.
 * Esta classe define os atributos e comportamentos relacionados a produtos.
 */
@Entity
public class Produto {

    /**
     * @brief Identificador único do produto.
     * A anotação @Id indica que este campo é a chave primária.
     * A anotação @GeneratedValue define que o valor será gerado automaticamente.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * @brief Nome do produto.
     * Representa o nome do produto no sistema.
     */
    private String nome;

    /**
     * @brief Preço do produto.
     * Representa o preço do produto em formato numérico (Double).
     */
    private Double preco;

    /**
     * @brief Quantidade em estoque do produto.
     * Representa a quantidade de unidades do produto disponíveis.
     */
    private int quantidade;

    /**
     * @brief Indica se o produto está disponível para pronta entrega.
     * Caso o valor seja true, o produto está disponível para entrega imediata.
     */
    private boolean entrega;

    /**
     * @brief Obtém o identificador do produto.
     * @return O identificador único do produto.
     */
    @JsonProperty("Id")
    public Long getId() {
        return id;
    }

    /**
     * @brief Define o identificador do produto.
     * @param id O identificador único do produto.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @brief Obtém o nome do produto.
     * @return O nome do produto.
     */
    @JsonProperty("Nome")
    public String getNome() {
        return nome;
    }

    /**
     * @brief Define o nome do produto.
     * @param nome O nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @brief Obtém o preço do produto formatado.
     * O preço será retornado no formato "R$ XX.XX".
     * @return O preço do produto formatado.
     */
    @JsonProperty("Preço")
    public String getPrecoFormatado() {
        return String.format("R$ %.2f", preco);
    }

    /**
     * @brief Define o preço do produto.
     * @param preco O preço do produto.
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * @brief Obtém a quantidade do produto em estoque.
     * @return A quantidade de unidades do produto.
     */
    @JsonProperty("Quantidade")
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @brief Define a quantidade do produto em estoque.
     * @param quantidade A quantidade de unidades do produto.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @brief Obtém o status de entrega do produto.
     * Retorna "Pronta Entrega" se o produto estiver disponível para pronta entrega,
     * caso contrário, retorna "Sem Pronta Entrega".
     * @return O status de entrega do produto.
     */
    @JsonProperty("Status para entrega")
    public String getStatusEntrega() {
        return entrega ? "Pronta Entrega" : "Sem Pronta Entrega";
    }

    /**
     * @brief Define o status de entrega do produto.
     * @param entrega Indica se o produto está disponível para pronta entrega.
     */
    public void setEntrega(boolean entrega) {
        this.entrega = entrega;
    }
}


