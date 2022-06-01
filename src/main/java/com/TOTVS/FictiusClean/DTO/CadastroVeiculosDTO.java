package com.TOTVS.FictiusClean.DTO;

import java.util.List;
import java.util.stream.Collectors;

import com.TOTVS.FictiusClean.Domain.CadastroVeiculos;



public class CadastroVeiculosDTO {

    
    private String nome;
    private String marca;
    private String modelo;
    private String datafabricacao;
    private Double consumomediocidade;
    private Double consumomediorodovias;

    public CadastroVeiculosDTO(CadastroVeiculos cad){

        this.nome = cad.getNome();
        this.marca = cad.getMarca();
        this.modelo = cad.getModelo();
        this.datafabricacao = cad.getDatafabricacao();
        this.consumomediocidade = cad.getConsumomediocidade();
        this.consumomediorodovias = cad.getConsumomediorodovias();
    }

    public static List<CadastroVeiculosDTO> converter(List<CadastroVeiculos> cads){
        return cads.stream().map(CadastroVeiculosDTO::new).collect(Collectors.toList());
    }
    
    
   public String getNome() {
	   return nome;
   }
   public String getMarca() {
	   return marca;
   }
   public String getModelo() {
	   return modelo;
   }
   public String getDatafabricacao() {
	   return datafabricacao;
   }
   public Double getConsumomediocidade() {
	   return consumomediocidade;
   }
   public Double getConsumomediorodovias() {
	   return consumomediorodovias;
   }


}
