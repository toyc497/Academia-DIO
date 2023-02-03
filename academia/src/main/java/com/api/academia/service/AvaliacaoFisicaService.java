package com.api.academia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.academia.entity.Aluno;
import com.api.academia.entity.AvaliacaoFisica;
import com.api.academia.map.AvaliacaoFisicaForm;
import com.api.academia.repository.AlunoRepository;
import com.api.academia.repository.AvaliacaoFisicaRepository;

@Service
public class AvaliacaoFisicaService {

	@Autowired
	private AvaliacaoFisicaRepository avaliacaoFisicaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public List<AvaliacaoFisica> findAllAvaliacaoFisica(){
		
		return avaliacaoFisicaRepository.findAll();
		
	}
	
	public AvaliacaoFisica saveAvaliacaoFisica(AvaliacaoFisicaForm avaliacaoForm) {
		
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		
		long idAluno = avaliacaoForm.getAlunoid();
		
		Aluno alunoResponse = alunoRepository.findById(idAluno);
		
		avaliacaoFisica.setAluno(alunoResponse);
		avaliacaoFisica.setPeso(avaliacaoForm.getPeso());
		avaliacaoFisica.setAltura(avaliacaoForm.getAltura());
		
		return avaliacaoFisicaRepository.save(avaliacaoFisica);
		
	}
	
}
