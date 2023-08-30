package com.daniela.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private String capital;
	private String continente;
	private String cantHabitantes;
	
	public Pais() {
		super();
	}

	public Pais(Integer id, String nombre, String capital, String continente, String cantHabitantes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.capital = capital;
		this.continente = continente;
		this.cantHabitantes = cantHabitantes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getCantHabitantes() {
		return cantHabitantes;
	}

	public void setCantHabitantes(String cantHabitantes) {
		this.cantHabitantes = cantHabitantes;
	}
	
}
