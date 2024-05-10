package com.bradesco.sistemabradesco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bradesco.sistemabradesco.models.Protocolo;



public interface ProtocoloRepository extends JpaRepository<Protocolo, Integer>{
  Protocolo findByCodigo(int codigo);
  
}
