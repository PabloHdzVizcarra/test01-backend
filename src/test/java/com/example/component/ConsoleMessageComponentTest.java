package com.example.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsoleMessageComponentTest {
  private OutPutMessageComponent outPutMessageComponent;
  
  @BeforeEach
  void setUp() {
    outPutMessageComponent = new ConsoleMessageComponent();
  }

  @Test
  void verificarPesoIdeal() {
    outPutMessageComponent.checkIMC(0);
  }

  @Test
  void verificarSobrepeso() {
    outPutMessageComponent.checkIMC(1);
  }

  @Test
  void verificarPesoBajo() {
    outPutMessageComponent.checkIMC(-1);
  }
}