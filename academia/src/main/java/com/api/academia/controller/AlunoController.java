package com.api.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.academia.entity.Aluno;
import com.api.academia.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@GetMapping("/allAlunos")
	public List<Aluno> getAll(){
		
		return alunoService.getAll();
		
	}
	
	@PostMapping("/inserirAluno")
	public Aluno saveAluno(@RequestBody Aluno aluno) {
		
		return alunoService.saveAluno(aluno);
		
	}
	
	@DeleteMapping("/deletaAluno/{id}")
	public void deleteAluno(@PathVariable("id") Long id) {
		
		alunoService.deleteAluno(id);
		
	}
	
}
