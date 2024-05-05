package com.bradesco.sistemabradesco.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bradesco.sistemabradesco.repository.FuncionarioRepository;

@Service
public class FuncionarioServices {
  @Autowired
  private FuncionarioRepository funcionario;
}
