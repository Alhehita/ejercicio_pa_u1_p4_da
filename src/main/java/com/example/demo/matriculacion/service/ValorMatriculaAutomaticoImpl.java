package com.example.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("manual")
public class ValorMatriculaAutomaticoImpl implements ValorMatricula {

	@Override
	public BigDecimal valorTotal(BigDecimal precio) {

		BigDecimal valor;

		valor = precio.multiply(new BigDecimal(15).divide(new BigDecimal(100)));

		return valor;
	}

}
