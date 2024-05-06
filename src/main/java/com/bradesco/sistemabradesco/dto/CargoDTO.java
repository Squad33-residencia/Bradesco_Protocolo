package com.bradesco.sistemabradesco.dto;


import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.models.Cargo;

public class CargoDTO{
  private int codigo;
  private String cargo;

public CargoDTO(Cargo cargo){
  BeanUtils.copyProperties(cargo, this);
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
}