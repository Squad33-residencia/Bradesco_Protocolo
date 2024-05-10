package com.bradesco.sistemabradesco.models;

import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.dto.FuncionarioDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;


@Entity
@Table(name = "funcionario")
public class Funcionario {
  @Id
  @Column(name="codigo")
  private String codigo;

  @Column(name = "nome", length = 60, nullable = false)
  private String nome;

  @Column(name = "email", length = 60, nullable = false)
  @Email
  private String email;

  @Column(name = "status_funcionario", length = 10, nullable = false)
  private String statusFuncionario;

  @ManyToOne
  @JoinColumn(name = "cargo_codigo", referencedColumnName = "codigo")
  private Cargo cargo;

  @ManyToOne
  @JoinColumn(name = "departamento_codigo", referencedColumnName = "codigo")
  private Departamento departamento;

  @Column(name = "senha", length = 40, nullable = false)
  private String senha;

  public Funcionario() {
  }

  public Funcionario(FuncionarioDTO funcionarioDTO) {
    BeanUtils.copyProperties(funcionarioDTO, this);
  }
  
  //GETTERS AND SETTERS
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

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

    

  //METODOS HASHCODE E EQUALS
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Funcionario other = (Funcionario) obj;
    if (codigo == null) {
      if (other.codigo != null)
        return false;
    } else if (!codigo.equals(other.codigo))
      return false;
    return true;
  }

}//class
