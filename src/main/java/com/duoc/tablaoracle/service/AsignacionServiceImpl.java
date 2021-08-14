package com.duoc.tablaoracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.tablaoracle.model.Asignacion;
import com.duoc.tablaoracle.repository.AsignacionRepository;

@Service
public class AsignacionServiceImpl implements AsignacionService{
	
	@Autowired
	private AsignacionRepository repo;
	
	@Override
	public void agregarAsignacion(Asignacion asignacion) {
		// TODO Auto-generated method stub
		repo.save(asignacion);
		
	}

	@Override
	public void eliminarAsignacion(long idAsignacion) {
		// TODO Auto-generated method stub
		repo.deleteById(idAsignacion);
		
	}

	@Override
	public void actualizarAsignacion(Asignacion asignacion) {
		// TODO Auto-generated method stub
		repo.save(asignacion);
	}

	@Override
	public List<Asignacion> listarAsignaciones() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Asignacion buscarAsignacion(long idAsignacion) {
		// TODO Auto-generated method stub
		return repo.findById(idAsignacion).get();
	}

}
