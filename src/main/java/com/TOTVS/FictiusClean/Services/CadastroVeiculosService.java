package com.TOTVS.FictiusClean.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TOTVS.FictiusClean.Domain.CadastroVeiculos;
import com.TOTVS.FictiusClean.Repositories.CadastroVeiculosRepository;

@Service
public class CadastroVeiculosService {
	
	  @Autowired
	  private CadastroVeiculosRepository repo;

	    public CadastroVeiculos insert(CadastroVeiculos obj){
	        obj.setId(null);
	        return repo.save(obj);

	    }

}