package com.TOTVS.FictiusClean.Resources;



import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TOTVS.FictiusClean.DTO.CadastroVeiculosDTO;
import com.TOTVS.FictiusClean.DTO.GastosDTO;
import com.TOTVS.FictiusClean.Domain.CadastroVeiculos;

import com.TOTVS.FictiusClean.Repositories.CadastroVeiculosRepository;
import com.TOTVS.FictiusClean.Services.CadastroVeiculosService;





@RestController
@RequestMapping("/ranking")
public class RankingResources {
	
	@Autowired
	private CadastroVeiculosService cadastroVeiculosService;
	
	

	@GetMapping("/getveiculo")
	public ResponseEntity<List<CadastroVeiculos>> getVeiculos() {

		ResponseEntity<List<CadastroVeiculos>> response = null;
		try {
			List<CadastroVeiculos> veiculos = cadastroVeiculosService.getVeiculos();
			response = ResponseEntity.ok(veiculos);
		} catch (Exception e) {
			// TODO: Tratar erro melhor
			response = ResponseEntity.status(500).build();
		}

		return response;

	}

	@GetMapping("/getveiculo/{id}")
	public ResponseEntity<CadastroVeiculos> getVeiculo(@PathVariable Integer id) {

		ResponseEntity<CadastroVeiculos> response = null;
		try {
			CadastroVeiculos veiculo = cadastroVeiculosService.getVeiculoById(id);

			response = ResponseEntity.ok(veiculo);
		} catch (Exception e) {
			// TODO: Tratar erro melhor
			ResponseEntity.status(500).build();
		}

		return response;
	}

	@PostMapping("/cadastroveiculos")
	 public ResponseEntity<Object> lista(@RequestBody CadastroVeiculos obj) throws UnknownHostException {
		
				
		cadastroVeiculosService.insert(obj);
	    return ResponseEntity.noContent().build();
	    }
		
	
	
	@GetMapping("/totalgasto")
	public ResponseEntity<List> getGastos(@RequestBody GastosDTO gastosRequestDTO) {

		ResponseEntity<List> response = null;
		try {
			List gastos = cadastroVeiculosService.calculaGastosCarros(gastosRequestDTO);

			response = ResponseEntity.ok(gastos);
		} catch (Exception e) {
			// TODO: Tratar erro melhor
			ResponseEntity.status(500).build();
		}

		return response;
	}


}