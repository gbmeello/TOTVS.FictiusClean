package com.TOTVS.FictiusClean.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TOTVS.FictiusClean.Domain.CadastroVeiculos;


@Repository
public interface CadastroVeiculosRepository extends JpaRepository<CadastroVeiculos, Integer> {

}
