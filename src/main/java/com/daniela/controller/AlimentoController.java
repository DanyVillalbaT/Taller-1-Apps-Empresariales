package com.daniela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniela.models.Alimento;
import com.daniela.repository.IAlimentoRepository;

@Controller
@RequestMapping("/alimento")
public class AlimentoController {

	@Autowired
	private IAlimentoRepository alimentoRepository;
	
	@GetMapping("/alimentos")
	public String listarPaises(Model model) {

		List<Alimento> alimentos = alimentoRepository.findAll();
		model.addAttribute("alimentos", alimentos);
		return "lista-alimentos";
	}
}
