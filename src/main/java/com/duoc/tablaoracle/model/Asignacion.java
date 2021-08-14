package com.duoc.tablaoracle.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ASIGNACION database table.
 * 
 */
@Entity
@NamedQuery(name="Asignacion.findAll", query="SELECT a FROM Asignacion a")
public class Asignacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idasignacion;

	@Temporal(TemporalType.DATE)
	private Date fecinicio;

	@Temporal(TemporalType.DATE)
	private Date fectermino;

	private BigDecimal horas;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="RUT")
	private Empleado empleado;

	//bi-directional many-to-one association to Proyecto
	@ManyToOne
	@JoinColumn(name="CODPROYECTO")
	private Proyecto proyecto;

	public Asignacion() {
	}

	public long getIdasignacion() {
		return this.idasignacion;
	}

	public void setIdasignacion(long idasignacion) {
		this.idasignacion = idasignacion;
	}

	public Date getFecinicio() {
		return this.fecinicio;
	}

	public void setFecinicio(Date fecinicio) {
		this.fecinicio = fecinicio;
	}

	public Date getFectermino() {
		return this.fectermino;
	}

	public void setFectermino(Date fectermino) {
		this.fectermino = fectermino;
	}

	public BigDecimal getHoras() {
		return this.horas;
	}

	public void setHoras(BigDecimal horas) {
		this.horas = horas;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Proyecto getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

}