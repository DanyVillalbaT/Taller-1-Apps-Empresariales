package com.daniela.models;

import java.time.Year;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cancion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private String genero;
	private String autor;
	private Year fechaLanzamiento;
	
	public Cancion() {
		super();
	}

	public Cancion(int id, String nombre, String genero, String autor, Year fechaLanzamiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.autor = autor;
		this.fechaLanzamiento = fechaLanzamiento;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Year getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(Year fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
}
