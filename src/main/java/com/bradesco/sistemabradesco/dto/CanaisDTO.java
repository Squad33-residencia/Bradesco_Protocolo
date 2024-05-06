package com.bradesco.sistemabradesco.dto;

import org.springframework.beans.BeanUtils;


import com.bradesco.sistemabradesco.models.Canais;


public class CanaisDTO{
    private int codigo;
    private String canal;

  public CanaisDTO(){

  }

 public CanaisDTO(Canais canais){
     BeanUtils.copyProperties(canais, this);
 }

  // public CanaisDTO(Canais canais){
  //   BeanUtils.copyProperties(canais, this);
  // }


   //GETTERS AND SETTERS
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getCanal() {
    return canal;
  }

  public void setCanal(String canal) {
    this.canal = canal;
  }

}