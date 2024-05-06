package com.bradesco.sistemabradesco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bradesco.sistemabradesco.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {
  
}
