package com.bradesco.sistemabradesco.dto;

import org.springframework.beans.BeanUtils;

import com.bradesco.sistemabradesco.models.Cliente;
import com.bradesco.sistemabradesco.models.TelefoneCliente;

public class TelefoneClienteDTO {

  private int codigo;
  private int ddd;
  private int numero;
  private Cliente cliente;

  public TelefoneClienteDTO(TelefoneCliente telefoneCliente){
    BeanUtils.copyProperties(telefoneCliente, this);
  }

  public TelefoneClienteDTO() {
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getDdd() {
    return ddd;
  }

  public void setDdd(int ddd) {
    this.ddd = ddd;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
  
}
