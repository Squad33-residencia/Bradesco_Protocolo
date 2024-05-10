package com.bradesco.sistemabradesco.dto;

import org.springframework.beans.BeanUtils;
import com.bradesco.sistemabradesco.models.Cliente;
import com.bradesco.sistemabradesco.models.Conta;


public class ContaDTO{
    private int codigo;
    private int agencia;
    private int numeroConta;
    private String statusConta;
    private Cliente cliente;
    
    public ContaDTO() {
    }
    public ContaDTO(Conta conta) {
        BeanUtils.copyProperties(conta, this);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

}