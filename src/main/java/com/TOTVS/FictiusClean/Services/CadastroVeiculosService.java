package com.TOTVS.FictiusClean.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TOTVS.FictiusClean.DTO.GastosDTO;
import com.TOTVS.FictiusClean.DTO.ParametroRankingDTO;
import com.TOTVS.FictiusClean.Domain.CadastroVeiculos;
import com.TOTVS.FictiusClean.Repositories.CadastroVeiculosRepository;

@Service
public class CadastroVeiculosService {
	
	
		@Autowired
		private CadastroVeiculosRepository cadastroVeiculosRepository;
		

	    public CadastroVeiculos insert(CadastroVeiculos obj){
	        obj.setId(null);
	        return cadastroVeiculosRepository.save(obj);

	    }
	    
	    public List<CadastroVeiculos> getVeiculos() {
			List<CadastroVeiculos> findAll = cadastroVeiculosRepository.findAll();
			return findAll;
		}
		
		public CadastroVeiculos getVeiculoById(Integer id) {
			CadastroVeiculos cadveiculos = cadastroVeiculosRepository.getById(id);

			return cadveiculos;
		}
		public CadastroVeiculos createveiculo(CadastroVeiculos cadveiculo) {
			cadveiculo = cadastroVeiculosRepository.save(cadveiculo);

			return cadveiculo;
		}

		public CadastroVeiculos updateVeiculo(Integer id, CadastroVeiculos cadveiculos) throws Exception {
			CadastroVeiculos updatedVeiculo = cadastroVeiculosRepository.findById(id).map(encontrarCadVeiculo -> {
				encontrarCadVeiculo.setNome(cadveiculos.getNome());
				encontrarCadVeiculo.setMarca(cadveiculos.getMarca());
				encontrarCadVeiculo.setModelo(cadveiculos.getModelo());
				encontrarCadVeiculo.setDatafabricacao(cadveiculos.getDatafabricacao());
				encontrarCadVeiculo.setConsumomediocidade(cadveiculos.getConsumomediocidade());
				encontrarCadVeiculo.setConsumomediorodovias(cadveiculos.getConsumomediorodovias());
				encontrarCadVeiculo = cadastroVeiculosRepository.save(encontrarCadVeiculo);
				return encontrarCadVeiculo;
			}).orElseThrow(() -> new Exception("NOT FOUND"));
			//

			return updatedVeiculo;
		}
		public Boolean deleteVeiculo(CadastroVeiculos cadveiculos) {
			cadastroVeiculosRepository.delete(cadveiculos);

			return true;
		}
		
		public Boolean deleteVeiculoById(Integer id) {
			cadastroVeiculosRepository.deleteById(id);
			return true;
		}
		
		public List<ParametroRankingDTO> calculaGastosCarros(GastosDTO gastoDTO) {

			List<ParametroRankingDTO> gastos = new ArrayList<ParametroRankingDTO>();
			Double precoGasolina = gastoDTO.getPrecoGasolina();
			Double kmCidade = gastoDTO.getKmtotalCidade();
			Double kmRodovia = gastoDTO.getKmtotalRodovia();

			List<CadastroVeiculos> cadveiculos = cadastroVeiculosRepository.findAll();

			cadveiculos.forEach(veiculo -> {
				
				ParametroRankingDTO parametrosRankingDTO = new ParametroRankingDTO();

				Double consumo = calculaCombustivelGasto(veiculo, kmCidade, kmRodovia);
				Double valorGasto = consumo * precoGasolina;
				valorGasto = Math.round(valorGasto * 100.0) / 100.0;

				parametrosRankingDTO.setNome(veiculo.getNome());
				parametrosRankingDTO.setMarca(veiculo.getMarca());
				parametrosRankingDTO.setModelo(veiculo.getModelo());
				parametrosRankingDTO.setAno(veiculo.getDatafabricacao());
				parametrosRankingDTO.setQuantidadeCombustivel(consumo);
				parametrosRankingDTO.setValorGasto(valorGasto);
				
				gastos.add(parametrosRankingDTO);

			});

			Collections.sort(gastos, (veiculo1, veiculo2) -> veiculo1.getValorGasto().compareTo(veiculo2.getValorGasto()));

			return gastos;

		}

		public Double calculaCombustivelGasto(CadastroVeiculos cadveiculos, Double kmtotalCidade, Double kmtotalRodovia) {
			Double consumo = (kmtotalCidade / cadveiculos.getConsumomediocidade()) + (kmtotalRodovia / cadveiculos.getConsumomediocidade());

			return consumo;
		}

	}
