package com.daniela.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private String categoria;
	private String color;
	private String lugarProcedencia;
	
	public Alimento() {
		super();
	}

	public Alimento(int id, String nombre, String categoria, String color, String lugarProcedencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.color = color;
		this.lugarProcedencia = lugarProcedencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLugarProcedencia() {
		return lugarProcedencia;
	}

	public void setLugarProcedencia(String lugarProcedencia) {
		this.lugarProcedencia = lugarProcedencia;
	}
	
}
