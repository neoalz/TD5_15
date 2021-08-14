package com.duoc.tablaoracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.tablaoracle.model.Proyecto;
import com.duoc.tablaoracle.repository.ProyectoRepository;

@Service
public class ProyectoServiceImpl implements ProyectoService {
	
	@Autowired
	private ProyectoRepository repo;

	@Override
	public List<Proyecto> listarProyecto() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void agregarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		repo.save(proyecto);
		
	}

	@Override
	public Proyecto buscarProyecto(long codProyecto) {
		// TODO Auto-generated method stub
		return repo.findById(codProyecto).get();

	}
}
