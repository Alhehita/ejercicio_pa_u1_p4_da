package com.example.demo.matriculacion.repository;

import com.example.demo.modelo.Vehiculo;

public interface VehiculoRepository {
	
	public void insertar(String placa);
	public void borrar(String placa);
	public Vehiculo buscar(String placa);
	public void actualizar(Vehiculo vehiculo);
	
	


}
