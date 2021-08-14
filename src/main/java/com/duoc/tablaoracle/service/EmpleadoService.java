package com.duoc.tablaoracle.service;

import java.util.List;

import com.duoc.tablaoracle.model.Empleado;

public interface EmpleadoService {
	
	//void agregarEmpresa(Empresa empresa);
	//void eliminarEmpresa(int rut);
	//void actualizarEmpresa(Empresa empresa);
	List<Empleado> listarEmpleados();
	Empleado buscarEmpleado(long rut);

}
