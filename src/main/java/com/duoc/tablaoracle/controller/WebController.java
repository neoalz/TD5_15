package com.duoc.tablaoracle.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
	@Autowired
	private ProyectoService proyectoService;
	@Autowired
	private EmpresaService empresaService;
	@Autowired
	private EmpleadoService empleadoService;
	
	@ModelAttribute("asignacion")
	public Asignacion setAsignacion() 
	{
		return new Asignacion();
	}
	
	@ModelAttribute("empleado")
	public Empleado setEmpleado() 
	{
		return new Empleado();
	}
	
	@ModelAttribute("empresa")
	public Empresa setEmpresa() 
	{
		return new Empresa();
	}
	
	@ModelAttribute("proyecto")
	public Proyecto setProyecto() 
	{
		return new Proyecto();
	}

	//INDEX Y DIRECCIONAMIENTO
	@GetMapping("/")
	public String getIndex(Model model) 
	{
		model.addAttribute("lista",asignacionService.listarAsignaciones());
		return "index";
	}
	//METODOS PARA PROYECTOS
	
	@GetMapping("/paginaAgregarProyecto")
	public String getPaginaProyectos(Model model) 
	{
		return "agregarProyecto";
	}
	@GetMapping("/proyectos")
	public String getProyectos(@Valid @ModelAttribute("proyecto") Proyecto proyecto, BindingResult br, Model model) 
	{
		model.addAttribute("listaProyecto",proyectoService.listarProyecto());
		model.addAttribute("lista",asignacionService.listarAsignaciones());
		return "listarProyectos";
	}
	
	@PostMapping("/agregarProyecto")
	public String postAgregarProyecto(@Valid @ModelAttribute("proyecto") Proyecto proyecto, BindingResult br, Model model) {
		
		System.out.println(proyecto.toString());
		if (br.hasErrors()) {
			System.out.println(br.toString());
			return "agregarProyecto";
		}else {
			
			proyectoService.agregarProyecto(proyecto);
			model.addAttribute("listaProyecto",proyectoService.listarProyecto());
			return "listarProyectos";
		}
	}
	
	@PostMapping("/editarProyecto")
	public String postEditarProyecto(@Valid @ModelAttribute("proyecto") Proyecto proyecto, BindingResult br, Model model) {
		
		System.out.println(proyecto.toString());
		if (br.hasErrors()) {
			System.out.println(br.toString());
			return "listarProyectos";
		}else {
			
			model.addAttribute("proyecto",proyectoService.buscarProyecto(proyecto.getCodproyecto()));
			return "editarProyecto";
		}
	}
	
	@PostMapping("/modificarProyecto")
	public String postModificarProyecto(@Valid @ModelAttribute("proyecto") Proyecto proyecto, BindingResult br, Model model) {
		
		System.out.println(proyecto.toString());
		if (br.hasErrors()) {
			System.out.println(br.toString());
			return "editarProyecto";
		}else {
			
			proyectoService.actualizarProyecto(proyecto);
			model.addAttribute("listaProyecto",proyectoService.listarProyecto());
			
			return "listarProyectos";
		}

	}
	//METODOS PARA ASIGNACIÓN
	@GetMapping("/paginaAsignarProyecto")
	public String getPaginaAsignaciones(Model model) 
	{
		model.addAttribute("empleados", empleadoService.listarEmpleados());
		model.addAttribute("proyectos", proyectoService.listarProyecto());
		
		return "asignarProyecto";
	}
	
	@PostMapping("/agregarAsignacion")
	public String postAgregarAsignacion(@Valid @ModelAttribute("asignacion") Asignacion asignacion, BindingResult br, Model model) {
		
		System.out.println(asignacion.toString());
		if (br.hasErrors()) {
			System.out.println(br.toString());
			return "asignarProyecto";
		}else {
			
			asignacionService.agregarAsignacion(asignacion);
			model.addAttribute("lista",asignacionService.listarAsignaciones());
			return "index";
		}
	}
	@PostMapping("/editarAsignacion")
	public String postEditarAsignacion(@Valid @ModelAttribute("asignacion") Asignacion asignacion, BindingResult br, Model model) {
		
		if (br.hasErrors()) {
			System.out.println(br.toString());
			return "index";
		}else {
			
			model.addAttribute("asignacion",asignacionService.buscarAsignacion(asignacion.getIdasignacion()));
			model.addAttribute("empleados", empleadoService.listarEmpleados());
			model.addAttribute("proyectos", proyectoService.listarProyecto());
			return "editarAsignacion";
		}
	}
	
	@PostMapping("/modificarAsignacion")
	public String postModificarProyecto(@Valid @ModelAttribute("asignacion") Asignacion asignacion, BindingResult br, Model model) {
		
		System.out.println(asignacion);
		if (br.hasErrors()) {
			System.out.println(br.toString());
			return "editarAsignacion";
		}else {
			
			asignacionService.actualizarAsignacion(asignacion);
			model.addAttribute("lista",asignacionService.listarAsignaciones());
			return "index";
		}

	}
	
}
