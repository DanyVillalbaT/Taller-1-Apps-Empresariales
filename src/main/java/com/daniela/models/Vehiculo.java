package com.daniela.models;

import java.time.Year;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private String marca;
	private Year modelo;
	private double kilometraje;
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(int id, String nombre, String marca, Year modelo, double kilometraje) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.kilometraje = kilometraje;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Year getModelo() {
		return modelo;
	}

	public void setModelo(Year modelo) {
		this.modelo = modelo;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}
	
}
