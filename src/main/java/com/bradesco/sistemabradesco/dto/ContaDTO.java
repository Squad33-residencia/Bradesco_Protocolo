package com.bradesco.sistemabradesco.dto;

<<<<<<< HEAD
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
    

=======
import java.time.LocalDate;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import com.bradesco.sistemabradesco.models.Canais;
import com.bradesco.sistemabradesco.models.Cliente;
import com.bradesco.sistemabradesco.models.Departamento;
import com.bradesco.sistemabradesco.models.Protocolo;
import com.bradesco.sistemabradesco.models.TipoProtocolo;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class contaDTO{
    private
>>>>>>> b121324365d04a51c2ac87670268c7d5f97eba57
    
}
