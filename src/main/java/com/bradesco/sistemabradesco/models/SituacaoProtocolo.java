package com.bradesco.sistemabradesco.models;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.dto.SituacaoProtocoloDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "situacaoProtocolo")
public class SituacaoProtocolo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_incremento
  private int codigo;

  @ManyToOne
  @JoinColumn(name = "funcionario_codigo", referencedColumnName = "codigo")
  private Funcionario funcionario;

  @ManyToOne
  @JoinColumn(name = "protocolo_codigo", referencedColumnName = "codigo")
  private Protocolo protocolo;

  @Column(name = "resposta_protocolo", length = 2500)
  private String respostaProtocolo;

  @Column(name = "data_recebimento", nullable = false)
  private LocalDate dataRecebimento;

  @Column(name = "data_ultima_acao", nullable = false)
  private LocalDate dataUltimaAcao;

  
  public SituacaoProtocolo() {
  }

  public SituacaoProtocolo(SituacaoProtocoloDTO situacaoProtocoloDTO){
    BeanUtils.copyProperties(situacaoProtocoloDTO, this);
  }

  
  //GETTERS AND SETTERS
  public int getCodigo() {
    return codigo;
  }


  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }


  public Funcionario getFuncionario() {
    return funcionario;
  }


  public void setFuncionario(Funcionario funcionario) {
    this.funcionario = funcionario;
  }


  public Protocolo getProtocolo() {
    return protocolo;
  }


  public void setProtocolo(Protocolo protocolo) {
    this.protocolo = protocolo;
  }


  public String getRespostaProtocolo() {
    return respostaProtocolo;
  }


  public void setRespostaProtocolo(String respostaProtocolo) {
    this.respostaProtocolo = respostaProtocolo;
  }


  public LocalDate getDataRecebimento() {
    return dataRecebimento;
  }


  public void setDataRecebimento(LocalDate dataRecebimento) {
    this.dataRecebimento = dataRecebimento;
  }


  public LocalDate getDataUltimaAcao() {
    return dataUltimaAcao;
  }


  public void setDataUltimaAcao(LocalDate dataUltimaAcao) {
    this.dataUltimaAcao = dataUltimaAcao;
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
    SituacaoProtocolo other = (SituacaoProtocolo) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }

  
  
}//class
