package com.daniela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniela.models.Cancion;

public interface ICancionRepository extends JpaRepository<Cancion, Integer>{

}
