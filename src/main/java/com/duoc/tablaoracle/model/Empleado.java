package com.duoc.tablaoracle.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the EMPLEADO database table.
 * 
 */
@Entity
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long rut;

	private String apellidos;

	private String dv;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date fecingreso;

	@Temporal(TemporalType.DATE)
	private Date fecnac;

	private String nombres;

	private BigDecimal numcargas;

	private String numinterno;

	private BigDecimal numproyectos;

	private BigDecimal puntaje;

	private BigDecimal sueldo;

	private String zona;

	//bi-directional many-to-one association to Asignacion
	@OneToMany(mappedBy="empleado")
	private List<Asignacion> asignacions;

	//bi-directional many-to-one association to Empresa
	@ManyToOne
	@JoinColumn(name="RUTEMPRESA")
	private Empresa empresa;

	public Empleado() {
	}

	public long getRut() {
		return this.rut;
	}

	public void setRut(long rut) {
		this.rut = rut;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDv() {
		return this.dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecingreso() {
		return this.fecingreso;
	}

	public void setFecingreso(Date fecingreso) {
		this.fecingreso = fecingreso;
	}

	public Date getFecnac() {
		return this.fecnac;
	}

	public void setFecnac(Date fecnac) {
		this.fecnac = fecnac;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public BigDecimal getNumcargas() {
		return this.numcargas;
	}

	public void setNumcargas(BigDecimal numcargas) {
		this.numcargas = numcargas;
	}

	public String getNuminterno() {
		return this.numinterno;
	}

	public void setNuminterno(String numinterno) {
		this.numinterno = numinterno;
	}

	public BigDecimal getNumproyectos() {
		return this.numproyectos;
	}

	public void setNumproyectos(BigDecimal numproyectos) {
		this.numproyectos = numproyectos;
	}

	public BigDecimal getPuntaje() {
		return this.puntaje;
	}

	public void setPuntaje(BigDecimal puntaje) {
		this.puntaje = puntaje;
	}

	public BigDecimal getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public String getZona() {
		return this.zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public List<Asignacion> getAsignacions() {
		return this.asignacions;
	}

	public void setAsignacions(List<Asignacion> asignacions) {
		this.asignacions = asignacions;
	}

	public Asignacion addAsignacion(Asignacion asignacion) {
		getAsignacions().add(asignacion);
		asignacion.setEmpleado(this);

		return asignacion;
	}

	public Asignacion removeAsignacion(Asignacion asignacion) {
		getAsignacions().remove(asignacion);
		asignacion.setEmpleado(null);

		return asignacion;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}