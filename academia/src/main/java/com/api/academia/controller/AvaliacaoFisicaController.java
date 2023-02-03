package com.api.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.academia.entity.AvaliacaoFisica;
import com.api.academia.map.AvaliacaoFisicaForm;
import com.api.academia.service.AvaliacaoFisicaService;

@RestController
@RequestMapping("/avaliacaofisica")
public class AvaliacaoFisicaController {

	@Autowired
	private AvaliacaoFisicaService avaliacaoFisicaService;
	
	@GetMapping("/getAll")
	public List<AvaliacaoFisica> getAllAvaliacoes(){
		
		return avaliacaoFisicaService.findAllAvaliacaoFisica();
		
	}
	
	@PostMapping("/save")
	public AvaliacaoFisica saveAvaliacao(@RequestBody AvaliacaoFisicaForm avaliacao) {
		
		return avaliacaoFisicaService.saveAvaliacaoFisica(avaliacao);
		
	}
	
}
