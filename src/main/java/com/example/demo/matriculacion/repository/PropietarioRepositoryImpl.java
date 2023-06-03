package com.example.demo.matriculacion.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{

	@Autowired
	PropietarioRepository propietarioRepository;
	
	@Override
	public void insertar(String identificacion) {
		propietarioRepository.insertar(identificacion);		
	}

	@Override
	public void borrar(String identificacion) {
		propietarioRepository.borrar(identificacion);		
	}

	@Override
	public Propietario buscar(String identificacion) {
		return propietarioRepository.buscar(identificacion);
	}

	@Override
	public void actualizar(Propietario propietario) {
		propietarioRepository.actualizar(propietario);		
	}
	
	

}
