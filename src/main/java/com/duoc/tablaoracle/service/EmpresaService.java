package com.duoc.tablaoracle.service;

import java.util.List;

import com.duoc.tablaoracle.model.Empresa;

public interface EmpresaService {
	
	//void agregarEmpresa(Empresa empresa);
	//void eliminarEmpresa(int rut);
	//void actualizarEmpresa(Empresa empresa);
	List<Empresa> listarEmpresa();
	Empresa buscarEmpresa(long rutEmpresa);

}
