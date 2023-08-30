package com.daniela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniela.models.Alimento;

public interface IAlimentoRepository extends JpaRepository<Alimento, Integer>{

}
