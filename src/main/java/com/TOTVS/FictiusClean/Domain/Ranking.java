package com.TOTVS.FictiusClean.Domain;

import java.math.BigDecimal;

public class Ranking {
	
	
	String nome;
	String marca;
	String modelo;
	Integer anoDeFabricacao;
	Double qtdeDeCombustivel;
	Double valorGasto;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public void setAnoDeFabricacao(Integer anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	public Double getQtdeDeCombustivel() {
		return qtdeDeCombustivel;
	}
	public void setQtdeDeCombustivel(Double qtdeDeCombustivel) {
		this.qtdeDeCombustivel = qtdeDeCombustivel;
	}
	public Double getValorGasto() {
		return valorGasto;
	}
	public void setValorGasto(Double valorGasto) {
		this.valorGasto = valorGasto;
	}
	

}
