package com.example.demo.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository {

	@Autowired
	MatriculaRepository matriculaRepository;
	
	List<Matricula> baseDatos = new ArrayList<Matricula>();

	@Override
	public void insertar(String identificacion) {
		matriculaRepository.insertar(identificacion);
	}

	@Override
	public void borrar(String identificacion) {
		matriculaRepository.borrar(identificacion);
	}

	@Override
	public Matricula buscar(String identificacion) {
		return matriculaRepository.buscar(identificacion);
	}

	@Override
	public void actualizar(Matricula matricula) {
		matriculaRepository.actualizar(matricula);
	}

}
