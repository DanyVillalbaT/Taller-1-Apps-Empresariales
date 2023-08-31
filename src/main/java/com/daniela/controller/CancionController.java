package com.daniela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniela.models.Cancion;
import com.daniela.repository.ICancionRepository;

@Controller
@RequestMapping("/cancion")
public class CancionController {

	@Autowired
	private ICancionRepository cancionRepository;
	
	@GetMapping("/canciones")
	public String listarCanciones(Model model) {

		List<Cancion> canciones = cancionRepository.findAll();
		model.addAttribute("canciones", canciones);
		return "lista-canciones";
	}
}
