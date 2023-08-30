package com.daniela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniela.models.Pais;
import com.daniela.repository.IPaisRepository;

@Controller
@RequestMapping("/pais")
public class PaisController {

	@Autowired
	private IPaisRepository paisRepository;
	
	@GetMapping("/paises")
	public String listarPaises(Model model) {

		List<Pais> paises = paisRepository.findAll();
		model.addAttribute("paises", paises);
		return "lista-paises";
	}
}
