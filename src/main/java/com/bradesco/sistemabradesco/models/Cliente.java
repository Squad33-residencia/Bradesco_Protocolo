package com.bradesco.sistemabradesco.models;

import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.dto.ClienteDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
  @Id
  private String cpf;

  @Column(name = "nome", length = 60, nullable = false)
  private String nome;

  @Column(name = "email", length = 60, unique = true)
  private String email;

  @Column(name = "profissao", length = 60)
  private String profissao;

  @Column(name = "tipo_cliente", nullable = false)
  private String tipoCliente;

  @Column(name = "cnpj", length = 20)
  private String cnpj;

  @Column(name = "razao_social", length = 255)
  private String razaoSocial;



  public Cliente() {
  }

  public Cliente(ClienteDTO clienteDTO){
    BeanUtils.copyProperties(clienteDTO, this);
  }

  //GETTERS E SETTERS
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
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

  public String getProfissao() {
    return profissao;
  }

  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  public String getTipoCliente() {
    return tipoCliente;
  }

  public void setTipoCliente(String tipoCliente) {
    this.tipoCliente = tipoCliente;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getRazaoSocial() {
    return razaoSocial;
  }

  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  //METODOS HASHCODE E EQUALS
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
    return result;
  }// Este método é responsável por calcular o código de hash do objeto.

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Cliente other = (Cliente) obj;
    if (cpf == null) {
      if (other.cpf != null)
        return false;
    } else if (!cpf.equals(other.cpf))
      return false;
    return true;
  }// Este método verifica se dois objetos são iguais


  
}//class
