package com.TOTVS.FictiusClean.Resources;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.TOTVS.FictiusClean.Domain.RankingParametros;
import com.TOTVS.FictiusClean.Services.RankingService;




@RestController
@RequestMapping("/ranking")
public class RankingResources {
	
	
	@Autowired
	private RankingService service;
	
	RankingParametros rank = new RankingParametros();
	
	
	/*
	@RequestMapping(value = {"/ranking/{precoGasolina}"}, method = RequestMethod.GET)
	public String Ranking(
			
			@PathVariable Double precoGasolina
			
			){
		
		return "TESTANDO PRECO"+precoGasolina;
		
	}
	*/
	
	@RequestMapping(value = {"/ranking"},method = RequestMethod.GET)
	public ResponseEntity<List<RankingParametros>> getranking(
			
			@RequestParam Double precogasolina,
			@RequestParam Double totalkmcidade,
			@RequestParam Double totalkmrodovia
			
		){
		
		
		List pegarank;
		rank = new RankingParametros(precogasolina, totalkmcidade, totalkmrodovia);
		pegarank = this.service.pegandoorank(rank);
		return ResponseEntity.ok(pegarank);
		
	}
	

}
