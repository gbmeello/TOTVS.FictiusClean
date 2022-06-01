package com.TOTVS.FictiusClean.Domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "cadastroveiculos")
public class CadastroVeiculos {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Integer id;
	@Column(name = "nome")
    private String nome;
	@Column(name = "marca")
    private String marca;
	@Column(name = "modelo")
    private String modelo;
	@Column(name = "datafabricacao")
    private String datafabricacao;
	@Column(name = "consumomediocidade")
    private Double consumomediocidade;
	@Column(name = "consumomediorodovias")
    private Double consumomediorodovias;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getDatafabricacao() {
		return datafabricacao;
	}
	public void setDatafabricacao(String datafabricacao) {
		this.datafabricacao = datafabricacao;
	}
	public Double getConsumomediocidade() {
		return consumomediocidade;
	}
	public void setConsumomediocidade(Double consumomediocidade) {
		this.consumomediocidade = consumomediocidade;
	}
	public Double getConsumomediorodovias() {
		return consumomediorodovias;
	}
	public void setConsumomediorodovias(Double consumomediorodovias) {
		this.consumomediorodovias = consumomediorodovias;
	}
	
	public CadastroVeiculos() {
		
	}
	public CadastroVeiculos(String nome, String marca, String modelo, String datafabricacao,
			Double consumomediocidade, Double consumomediorodovias) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.datafabricacao = datafabricacao;
		this.consumomediocidade = consumomediocidade;
		this.consumomediorodovias = consumomediorodovias;
	}
	

}
	