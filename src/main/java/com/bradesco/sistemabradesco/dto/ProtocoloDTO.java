package com.bradesco.sistemabradesco.dto;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.models.Canais;
import com.bradesco.sistemabradesco.models.Cliente;
import com.bradesco.sistemabradesco.models.Departamento;
import com.bradesco.sistemabradesco.models.Protocolo;
import com.bradesco.sistemabradesco.models.TipoProtocolo;

public class ProtocoloDTO {

  private int codigo;
  private LocalDate dataAbertura; // melhor manipulação de data. LocalDate fornece muitas funções q podem ajudar
  private LocalDate dataPrazo;
  private String descricao;
  private Cliente cliente; //aceita nulo e chave estrageira
  private Canais canal; //chave estrageira
  private TipoProtocolo tipoProtocolo;//chave estrageira
  private LocalDate dataRecebimentoInicial;
  private Departamento departamento; //chave estrageira
  private boolean propensaoBacen ;
  private boolean agilizar;
  private boolean devido;
  private boolean procedente;
  private Long numeroProtocolo;

  //CONSTRUTUOR DE IMPORTAÇÃO DA ENTIDADE PROTOCOLO
  public ProtocoloDTO(Protocolo protocolo){
    BeanUtils.copyProperties(protocolo, this);
  }

  //CONSTRUTOR VAZIO
  public ProtocoloDTO(){

  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public LocalDate getDataAbertura() {
    return dataAbertura;
  }

  public void setDataAbertura(LocalDate dataAbertura) {
    this.dataAbertura = dataAbertura;
  }

  public LocalDate getDataPrazo() {
    return dataPrazo;
  }

  public void setDataPrazo(LocalDate dataPrazo) {
    this.dataPrazo = dataPrazo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Canais getCanal() {
    return canal;
  }

  public void setCanal(Canais canal) {
    this.canal = canal;
  }

  public TipoProtocolo getTipoProtocolo() {
    return tipoProtocolo;
  }

  public void setTipoProtocolo(TipoProtocolo tipoProtocolo) {
    this.tipoProtocolo = tipoProtocolo;
  }

  public LocalDate getDataRecebimentoInicial() {
    return dataRecebimentoInicial;
  }

  public void setDataRecebimentoInicial(LocalDate dataRecebimentoInicial) {
    this.dataRecebimentoInicial = dataRecebimentoInicial;
  }

  public Departamento getDepartamento() {
    return departamento;
  }

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }

  public boolean isPropensaoBacen() {
    return propensaoBacen;
  }

  public void setPropensaoBacen(boolean propensaoBacen) {
    this.propensaoBacen = propensaoBacen;
  }

  public boolean isAgilizar() {
    return agilizar;
  }

  public void setAgilizar(boolean agilizar) {
    this.agilizar = agilizar;
  }

  public boolean isDevido() {
    return devido;
  }

  public void setDevido(boolean devido) {
    this.devido = devido;
  }

  public boolean isProcedente() {
    return procedente;
  }

  public void setProcedente(boolean procedente) {
    this.procedente = procedente;
  }


  public Long getNumeroProtocolo() {
    return numeroProtocolo;
  }

  public void setNumeroProtocolo(Long numeroProtocolo) {
    this.numeroProtocolo = numeroProtocolo;
  }

}
