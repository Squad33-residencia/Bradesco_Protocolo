package com.bradesco.sistemabradesco.models;

import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.dto.CargoDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cargo")
public class Cargo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_incremento
  private int codigo;

  @Column(name = "cargo", length = 20, nullable = false)
  private String cargo;
  
  public Cargo() {
  }

  public Cargo(CargoDTO cargoDTO){
    BeanUtils.copyProperties(cargoDTO, this);
  }
  
  //GETTERS AND SETTERS
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
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
    Cargo other = (Cargo) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }// Este método verifica se dois objetos são iguais

    
  

}//class
