package com.duoc.tablaoracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.tablaoracle.model.Empresa;
import com.duoc.tablaoracle.repository.EmpresaRepository;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	private EmpresaRepository repo;

	@Override
	public List<Empresa> listarEmpresa() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Empresa buscarEmpresa(long rutEmpresa) {
		// TODO Auto-generated method stub
		return repo.findById(rutEmpresa).get();
	}

}
