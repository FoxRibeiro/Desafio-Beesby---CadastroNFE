package com.Beesby.CadastroNFE.models;

import jakarta.persistence.*;

@Entity
@Table(name = "notas_fiscais")
public class NFE {
    @Id
    @Column(name = "numero_nota")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numeroNota;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "razao_social")
    private String razaoSocial;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "numero_serie")
    private Integer numeroSerie;

    public Integer getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(Integer numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(Integer numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

}
