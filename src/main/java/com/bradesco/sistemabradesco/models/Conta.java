package com.bradesco.sistemabradesco.models;

import org.springframework.beans.BeanUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {
  @Id
  //auto incremento
  private int codigo;

  @Column(name = "agencia", length = 4, nullable = false)
  private int agencia; // 4 digitos

  @Column(name = "numero_conta", nullable = false)
  private int numeroConta;

  @Column(name = "status_conta", length = 10, nullable = false)
  private String statusConta;

  @ManyToOne
  @JoinColumn(name = "cliente_cpf", referencedColumnName = "cpf")
  private Cliente cliente;


  

  public Conta() {
  }

  public Conta (ContaDTO contaDTO){
     BeanUtils.copyProperties(contaDTO, this);
  }

  //GETTERS AND SETTERS
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public String getStatusConta() {
    return statusConta;
  }

  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }


  //METODOS HASHCODE E EQUALS
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigo;
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
    Conta other = (Conta) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }// Este método verifica se dois objetos são iguais



  
}//class
