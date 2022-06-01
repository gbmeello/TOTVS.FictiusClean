package com.TOTVS.FictiusClean.Services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.TOTVS.FictiusClean.Domain.Ranking;
import com.TOTVS.FictiusClean.Domain.RankingParametros;
import com.TOTVS.FictiusClean.Repositories.CadastroVeiculosRepository;

@Service
public class RankingService {
	
	
	CadastroVeiculosRepository cadastroveiculosrepository;


	
	public List<Ranking> pegandoorank(RankingParametros rankparametros){
		

		
		//aqui é pra fazer a conta
		
		Double valorcidade = rankparametros.getTotalkmcidade(); // dividir pelo consumo cidade
		Double valorrodovia = rankparametros.getTotalkmrodovia(); // dividir pelo consumo rodovia
		Double qtdcombustiveltotal = valorcidade + valorrodovia; 
		Double valortotalgasto = qtdcombustiveltotal*rankparametros.getPrecogasolina();
		
		System.out.println(valortotalgasto);
		System.out.println(qtdcombustiveltotal);
		System.out.println(valorrodovia);
		System.out.println(valorcidade);
		
		
		// retorna os resultados
		
		
		return pegandoorank(rankparametros);
		
	}
	
		

	
}