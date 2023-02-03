package com.api.academia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.academia.entity.Aluno;
import com.api.academia.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	public Aluno saveAluno(Aluno aluno) {
		
		return alunoRepository.save(aluno);
		
	}
	
	/*
	public Aluno findAlunoById(Long id) {
		
		return alunoRepository.findById(id);
		
	}
	*/
	
	public List<Aluno> getAll(){
		
		return alunoRepository.findAll();
		
	}
	
	public void deleteAluno(Long id) {
		
		alunoRepository.deleteById(id);
		
	}
	
}
