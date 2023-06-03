package com.example.demo.matriculacion.service;

import com.example.demo.modelo.Matricula;

public interface MatriculaService {
	
	public void ingresar(String identificacion, String placa);
	public void actualizar(Matricula matricula);

}
