package com.duoc.tablaoracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.duoc.tablaoracle.model.Asignacion;
import com.duoc.tablaoracle.model.Empleado;
import com.duoc.tablaoracle.model.Empresa;
import com.duoc.tablaoracle.model.Proyecto;
import com.duoc.tablaoracle.service.AsignacionService;
import com.duoc.tablaoracle.service.EmpleadoService;
import com.duoc.tablaoracle.service.EmpresaService;
import com.duoc.tablaoracle.service.ProyectoService;

@Controller
public class WebController {
	
	@Autowired
	private AsignacionService asignacionService;
	private ProyectoService proyectoService;
	private EmpresaService empresaService;
	private EmpleadoService empleadoService;
	
	@ModelAttribute
	public Asignacion setAsignacion() 
	{
		return new Asignacion();
	}
	
	@ModelAttribute
	public Empleado setEmpleado() 
	{
		return new Empleado();
	}
	
	@ModelAttribute
	public Empresa setEmpresa() 
	{
		return new Empresa();
	}
	
	@ModelAttribute
	public Proyecto setProyecto() 
	{
		return new Proyecto();
	}
	
	//GetMapping
	@GetMapping("/")
	public String getIndex(Model model) 
	{
		model.addAttribute("lista",asignacionService.listarAsignaciones());
		return "index";
	}

}
