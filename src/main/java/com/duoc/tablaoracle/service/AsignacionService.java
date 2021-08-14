package com.duoc.tablaoracle.service;

import java.util.List;

import com.duoc.tablaoracle.model.Asignacion;


public interface AsignacionService {

	void agregarAsignacion(Asignacion asignacion);
	void eliminarAsignacion(long idAsignacion);
	void actualizarAsignacion(Asignacion asignacion);
	List<Asignacion> listarAsignaciones();
	Asignacion buscarAsignacion(long idAsignacion);
	
}
