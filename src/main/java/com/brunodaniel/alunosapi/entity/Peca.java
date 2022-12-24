package com.brunodaniel.alunosapi.entity;

import jakarta.persistence.*;

@Entity
public class Peca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "codigo_barras", nullable = false)
    private String codigoBarras;

    @Column(nullable = false)
    private String nome;

    @Column(name = "modelo_carro", nullable = false)
    private String modeloCarro;

    @Column(nullable = false)
    private String fabricante;

    @Column(name = "preco_custo", nullable = false)
    private float precoCusto;

    @Column(name = "preco_venda", nullable = false)
    private float precoVenda;

    @Column(name = "qtd_estoque", nullable = false)
    private int qtdEstoque;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Categoria categoria;

    public Peca() { }

    public Peca(Long id, String codigoBarras, String nome, String modeloCarro, String fabricante, float precoCusto, float precoVenda, int qtdEstoque, Categoria categoria) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.modeloCarro = modeloCarro;
        this.fabricante = fabricante;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
