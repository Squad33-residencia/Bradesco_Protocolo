package com.bradesco.sistemabradesco.models;

import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.dto.TipoProtocoloDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoProtocolo")
public class TipoProtocolo {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_incremento
  @Column(name= "codigo")
  private int codigo;

  @Column(name = "tipo", length = 20, nullable = false)
  private String tipo;

  @Column(name = "prazo_tratativa")
  private int prazoTratativa;

  @Column(name = "dias_uteis", nullable = false)
  private boolean diasUteis;



  public TipoProtocolo() {
  }
  public TipoProtocolo(TipoProtocoloDTO tipoProtocoloDTO) {
    BeanUtils.copyProperties(tipoProtocoloDTO, this);
  }
  

  //GETTERS AND SETTERS
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

  public int getPrazoTratativa() {
    return prazoTratativa;
  }

  public void setPrazoTratativa(int prazoTratativa) {
    this.prazoTratativa = prazoTratativa;
  }

  public boolean isDiasUteis() {
    return diasUteis;
  }

  public void setDiasUteis(boolean diasUteis) {
    this.diasUteis = diasUteis;
  }

//METODOS HASHCODE E EQUALS
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
    TipoProtocolo other = (TipoProtocolo) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }

  

  
}//class
