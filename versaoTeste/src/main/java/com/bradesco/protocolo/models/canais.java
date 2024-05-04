package com.bradesco.protocolo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "canais")
public class canais {
  @Id
  private Long codigo;
  private String canal;
  
  

  public canais() {
  }

  public canais(Long codigo, String canal) {
    this.codigo = codigo;
    this.canal = canal;
  }


  public Long getCodigo() {
    return codigo;
  }


  public void setCodigo(Long codigo) {
    this.codigo = codigo;
  }


  public String getCanal() {
    return canal;
  }


  public void setCanal(String canal) {
    this.canal = canal;
  }





  
}

