package com.duoc.tablaoracle.service;

import java.util.List;


import com.duoc.tablaoracle.model.Proyecto;

public interface ProyectoService {
	
	List<Proyecto> listarProyecto();
	void agregarProyecto(Proyecto proyecto);
	//void eliminarProyecto(int codProyecto);
	void actualizarProyecto(Proyecto proyecto);	
	Proyecto buscarProyecto(long codProyecto);
}
