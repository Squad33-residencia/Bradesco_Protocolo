package com.bradesco.protocolo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import jakarta.persistence.EntityManagerFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

@SpringJUnitConfig
@SpringBootTest
public class DatabaseConnectionTests {

      @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Test
    public void testDatabaseConnection() {
        assertNotNull(entityManagerFactory, "O bean do EntityManagerFactory não deve ser nulo. A conexão com o banco de dados foi estabelecida com sucesso.");
    }
}
