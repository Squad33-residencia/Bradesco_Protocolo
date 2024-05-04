package com.bradesco.protocolo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bradesco.protocolo.models.canais;
import com.bradesco.protocolo.models.CanaisRepository;

import java.util.List;


@SpringBootTest
public class CanaisRepositoryTests {

  @Autowired
  private CanaisRepository canaisRepository;

  @Test
  public void testFindAll() {
      // Chama o método findAll do repositório para buscar todos os canais
      List<canais> canais = canaisRepository.findAll();

      // Exibe os valores dos canais recuperados do banco de dados
      for (canais canal : canais) {
          System.out.println("Nome do canal: " + canal.getCanal());
          // Adicione aqui outras informações do canal que deseja exibir
      }
  }
}
