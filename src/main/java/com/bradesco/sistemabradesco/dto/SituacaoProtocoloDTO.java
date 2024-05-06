package com.bradesco.sistemabradesco.dto;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.models.Funcionario;
import com.bradesco.sistemabradesco.models.Protocolo;
import com.bradesco.sistemabradesco.models.SituacaoProtocolo;


public class SituacaoProtocoloDTO {

  private int codigo;
  private Funcionario funcionario;
  private Protocolo protocolo;
  private String respostaProtocolo;
  private LocalDate dataRecebimento;
  private LocalDate dataUltimaAcao;

  public SituacaoProtocoloDTO(SituacaoProtocolo situacaoProtocolo){
    BeanUtils.copyProperties(situacaoProtocolo, this);
  }

  public SituacaoProtocoloDTO(){
  }

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

  
}