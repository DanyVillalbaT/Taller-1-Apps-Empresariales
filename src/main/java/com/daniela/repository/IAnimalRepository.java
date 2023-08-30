package com.daniela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniela.models.Animal;

public interface IAnimalRepository extends JpaRepository<Animal, Integer>{

}
