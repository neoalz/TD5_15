package com.duoc.tablaoracle.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PROYECTO database table.
 * 
 */
@Entity
@NamedQuery(name="Proyecto.findAll", query="SELECT p FROM Proyecto p")
public class Proyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long codproyecto;

	private String nomproyecto;

	//bi-directional many-to-one association to Asignacion
	@OneToMany(mappedBy="proyecto")
	private List<Asignacion> asignacions;

	public Proyecto() {
	}

	public long getCodproyecto() {
		return this.codproyecto;
	}

	public void setCodproyecto(long codproyecto) {
		this.codproyecto = codproyecto;
	}

	public String getNomproyecto() {
		return this.nomproyecto;
	}

	public void setNomproyecto(String nomproyecto) {
		this.nomproyecto = nomproyecto;
	}

	public List<Asignacion> getAsignacions() {
		return this.asignacions;
	}

	public void setAsignacions(List<Asignacion> asignacions) {
		this.asignacions = asignacions;
	}

	public Asignacion addAsignacion(Asignacion asignacion) {
		getAsignacions().add(asignacion);
		asignacion.setProyecto(this);

		return asignacion;
	}

	public Asignacion removeAsignacion(Asignacion asignacion) {
		getAsignacions().remove(asignacion);
		asignacion.setProyecto(null);

		return asignacion;
	}

}