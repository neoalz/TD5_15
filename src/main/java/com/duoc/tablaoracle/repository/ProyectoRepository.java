package com.duoc.tablaoracle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duoc.tablaoracle.model.Proyecto;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
	
	//public List<Proyecto> findAllByCodproyecto(long id);

}
