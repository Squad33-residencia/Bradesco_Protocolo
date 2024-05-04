package com.bradesco.protocolo.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CanaisRepository extends JpaRepository<canais, Long> {
    // Métodos de consulta personalizados, se necessário
}