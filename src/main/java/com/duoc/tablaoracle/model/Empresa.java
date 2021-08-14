package com.duoc.tablaoracle.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the EMPRESA database table.
 * 
 */
@Entity
@NamedQuery(name="Empresa.findAll", query="SELECT e FROM Empresa e")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long rut;

	private String dv;

	private String razonsocial;

	//bi-directional many-to-one association to Empleado
	@OneToMany(mappedBy="empresa")
	private List<Empleado> empleados;

	public Empresa() {
	}

	public long getRut() {
		return this.rut;
	}

	public void setRut(long rut) {
		this.rut = rut;
	}

	public String getDv() {
		return this.dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	public String getRazonsocial() {
		return this.razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado addEmpleado(Empleado empleado) {
		getEmpleados().add(empleado);
		empleado.setEmpresa(this);

		return empleado;
	}

	public Empleado removeEmpleado(Empleado empleado) {
		getEmpleados().remove(empleado);
		empleado.setEmpresa(null);

		return empleado;
	}

}