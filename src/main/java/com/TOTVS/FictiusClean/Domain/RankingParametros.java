package com.TOTVS.FictiusClean.Domain;

import java.math.BigDecimal;

import com.sun.istack.NotNull;

import lombok.NonNull;


public class RankingParametros {

	
	@NotNull
	@NonNull
	Double precogasolina;

	@NotNull
	@NonNull
	Double totalkmcidade;

	@NotNull
	@NonNull
	Double totalkmrodovia;

	public Double getPrecogasolina() {
		return precogasolina;
	}

	public void setPrecogasolina(Double precogasolina) {
		this.precogasolina = precogasolina;
	}

	public Double getTotalkmcidade() {
		return totalkmcidade;
	}

	public void setTotalkmcidade(Double totalkmcidade) {
		this.totalkmcidade = totalkmcidade;
	}

	public Double getTotalkmrodovia() {
		return totalkmrodovia;
	}

	public void setTotalkmrodovia(Double totalkmrodovia) {
		this.totalkmrodovia = totalkmrodovia;
	}

	public RankingParametros(@NonNull Double precogasolina, @NonNull Double totalkmcidade,
			@NonNull Double totalkmrodovia) {
		super();
		this.precogasolina = precogasolina;
		this.totalkmcidade = totalkmcidade;
		this.totalkmrodovia = totalkmrodovia;
	}
	public RankingParametros() {
		
	}
	

}

