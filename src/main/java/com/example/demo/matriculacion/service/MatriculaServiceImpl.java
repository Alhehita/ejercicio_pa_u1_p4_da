package com.example.demo.matriculacion.service;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;

@Service()
public class MatriculaServiceImpl implements MatriculaService{

	@Autowired
	MatriculaService matriculaService;
	
	@Autowired
	@Qualifier("manual")
	ValorMatricula valorMatricula;
	
	
	@Override
	public void ingresar(String identificacion, String placa) {

		matriculaService.ingresar(identificacion, placa);
	}

	@Override
	public void actualizar(Matricula matricula) {
		matriculaService.actualizar(matricula);
		
	}
	
	public void valorMatricula(BigDecimal valor) {
	BigDecimal valorT=valorMatricula.valorTotal(valor);
	
/*	if(valorT.compareTo(new BigDecimal(3000))) {
		valorT.multiply(new BigDecimal(9).divide(new BigDecimal(100)));
	}*/

		

	}
	
	
	

}
