package com.example.demo.matriculacion.repository;

import com.example.demo.modelo.Propietario;

public interface PropietarioRepository {
	
	public void insertar(String identificacion);
	public void borrar(String identificacion);
	public Propietario buscar(String identificacion);
	public void actualizar(Propietario propietario);
	
	


}
