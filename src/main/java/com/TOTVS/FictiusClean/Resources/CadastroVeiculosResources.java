package com.TOTVS.FictiusClean.Resources;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.TOTVS.FictiusClean.Domain.CadastroVeiculos;
import com.TOTVS.FictiusClean.Services.CadastroVeiculosService;

@RestController
@RequestMapping(value ="/cadastroveiculos")
public class CadastroVeiculosResources {
	
	@Autowired
    private CadastroVeiculosService service;
	
	 @RequestMapping(method = RequestMethod.GET)
	    public String getinho(){
	        return "ROTA FUNCIONANDO";
	    }
	 
	 @RequestMapping(method = RequestMethod.POST)
	    public ResponseEntity<Object> lista(@RequestBody CadastroVeiculos obj) throws UnknownHostException {

	        service.insert(obj);
	        //return ApidosBotsDTO.converter (Arrays.asList(obj));
	        return ResponseEntity.noContent().build();
	    }
}