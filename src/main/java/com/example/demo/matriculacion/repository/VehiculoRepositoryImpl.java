package com.example.demo.matriculacion.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{

	@Autowired
	VehiculoRepository vehiculoRepository;
	
	@Override
	public void insertar(String placa) {
		vehiculoRepository.insertar(placa);		
	}

	@Override
	public void borrar(String placa) {
		vehiculoRepository.borrar(placa);		
	}

	@Override
	public Vehiculo buscar(String placa) {
		return vehiculoRepository.buscar(placa);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		vehiculoRepository.actualizar(vehiculo);		
	}

}
