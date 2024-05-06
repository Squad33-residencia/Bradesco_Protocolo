package com.bradesco.sistemabradesco.dto;

import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.models.Cargo;
import com.bradesco.sistemabradesco.models.Departamento;
import com.bradesco.sistemabradesco.models.Funcionario;

public class FuncionarioDTO {
  private String codigo;
  private String nome;
  private String email;
  private String statusFuncionario;
  private Cargo cargo;
  private Departamento departamento;
  
  public FuncionarioDTO(Funcionario funcionario) {
    BeanUtils.copyProperties(funcionario, this);
  }

  public FuncionarioDTO() {
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getStatusFuncionario() {
    return statusFuncionario;
  }

  public void setStatusFuncionario(String statusFuncionario) {
    this.statusFuncionario = statusFuncionario;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  public Departamento getDepartamento() {
    return departamento;
  }

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }
  
  
}
