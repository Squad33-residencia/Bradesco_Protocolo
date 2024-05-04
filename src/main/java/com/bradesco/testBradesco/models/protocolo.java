package com.bradesco.testBradesco.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name= "protocolo")
public class protocolo { 
  @Id
  private Long codigo;
  private LocalDate data_abertura; // melhor manipulação de data. LocalDate fornece muitas funções q podem ajudar
  private LocalDate data_prazo;
  private String descricao;
  


} //class
