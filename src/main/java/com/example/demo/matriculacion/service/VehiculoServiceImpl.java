package com.example.demo.matriculacion.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements VehiculoService{

	@Autowired
	VehiculoService vehiculoService;
	
	@Override
	public void insertar(String placa) {
		vehiculoService.insertar(placa);		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		vehiculo.setMarca(null);
		vehiculo.setModelo(null);
		vehiculo.setPlaca(null);
		vehiculo.setTipo(null);
		vehiculo.setPrecio(null);
	}

}
