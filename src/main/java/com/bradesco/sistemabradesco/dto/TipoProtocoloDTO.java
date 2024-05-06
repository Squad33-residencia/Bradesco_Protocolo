package com.bradesco.sistemabradesco.dto;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.models.TipoProtocolo;

public class TipoProtocoloDTO {
  
  private int codigo;
  private String tipo;
  private LocalDate prazoTratativa;
  private boolean diasUteis;

  public TipoProtocoloDTO(TipoProtocolo tipoProtocolo){
    BeanUtils.copyProperties(tipoProtocolo, this);
  }

  public TipoProtocoloDTO() {
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

  public LocalDate getPrazoTratativa() {
    return prazoTratativa;
  }

  public void setPrazoTratativa(LocalDate prazoTratativa) {
    this.prazoTratativa = prazoTratativa;
  }

  public boolean isDiasUteis() {
    return diasUteis;
  }

  public void setDiasUteis(boolean diasUteis) {
    this.diasUteis = diasUteis;
  }

  
}
