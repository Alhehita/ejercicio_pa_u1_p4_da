package com.example.demo.matriculacion.repository;

import com.example.demo.modelo.Matricula;

public interface MatriculaRepository {
	
	public void insertar(String identificacion);
	public void borrar(String identificacion);
	public Matricula buscar(String identificacion);
	public void actualizar(Matricula matricula);
	
	

}
