package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matriculacion.service.MatriculaService;
import com.example.demo.matriculacion.service.VehiculoService;
import com.example.demo.modelo.Vehiculo;

@SpringBootApplication
public class EjercicioPaU1P4DaApplication {
	
	@Autowired
	public static MatriculaService matricula;
	
	@Autowired
	public static VehiculoService vehiculoService;
	

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4DaApplication.class, args);
		
		Vehiculo auto = new Vehiculo();
		auto.setMarca("mazda");
		auto.setModelo("kjf");
		auto.setPlaca("pkn-123");
		vehiculoService.insertar("pkn-123");
		
		vehiculoService.actualizar(auto);
		
		
	}

}
