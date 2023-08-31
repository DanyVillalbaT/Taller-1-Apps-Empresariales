package com.daniela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniela.models.Vehiculo;
import com.daniela.repository.IVehiculoRepository;

@Controller
@RequestMapping("/vehiculo")
public class VehiculoController {

	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@GetMapping("/vehiculos")
	public String listarVehiculos(Model model) {

		List<Vehiculo> vehiculos = vehiculoRepository.findAll();
		model.addAttribute("vehiculos", vehiculos);
		return "lista-vehiculos";
	}
}
