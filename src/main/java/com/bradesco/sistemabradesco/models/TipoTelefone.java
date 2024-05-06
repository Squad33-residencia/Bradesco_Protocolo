package com.bradesco.sistemabradesco.models;


import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.dto.TipoTelefoneDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoTelefone")
public class TipoTelefone {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_incremento
  private int codigo;

  @Column(name = "tipo", length=20, nullable = false)
  private String tipo;

  @OneToOne
  @JoinColumn(name = "cliente_cpf", referencedColumnName = "cpf")
  private Cliente cliente;


  
  public TipoTelefone() {
  }
  public TipoTelefone(TipoTelefoneDTO tipoTelefoneDTO) {
    BeanUtils.copyProperties(tipoTelefoneDTO, this);
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigo;
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
    TipoTelefone other = (TipoTelefone) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }





}//class
