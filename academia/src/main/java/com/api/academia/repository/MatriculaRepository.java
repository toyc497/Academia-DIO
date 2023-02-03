package com.api.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.academia.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

}
