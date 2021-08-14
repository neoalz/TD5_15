package com.duoc.tablaoracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.tablaoracle.model.Empleado;
import com.duoc.tablaoracle.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoRepository repo;

	@Override
	public List<Empleado> listarEmpleados() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Empleado buscarEmpleado(long rut) {
		// TODO Auto-generated method stub
		return repo.findById(rut).get();
	}
	
	
}
