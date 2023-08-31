package com.daniela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniela.models.Vehiculo;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Integer>{

}
