package com.bradesco.sistemabradesco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

import com.bradesco.sistemabradesco.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {
  Funcionario findByCodigo(String codigo);
=======
import com.bradesco.sistemabradesco.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {
  
>>>>>>> b121324365d04a51c2ac87670268c7d5f97eba57
}
