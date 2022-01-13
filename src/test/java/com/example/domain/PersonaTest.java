package com.example.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
  private Persona persona;


  @BeforeEach
  void setUp() {
    persona = new Persona("john", 29, "H", 82.0, 1.75);
  }

  @Test
  void givenRecommendedValues_whenCalculateIMC() {
    persona = new Persona("john", 29, "H", 76.0, 1.75);
    int expected = 0;
    int actual = persona.calcularIMC();

    assertEquals(expected, actual);
  }

  @Test
  void givenLightValues_CalculateIMC() {
    persona = new Persona("john", 29, "H", 60.0, 1.75);
    int expected = -1;
    int actual = persona.calcularIMC();

    assertEquals(expected, actual);
  }

  @Test
  void givenWeightValues_whenCalculateIMC() {
    persona = new Persona("john", 29, "H", 82.0, 1.75);
    int expected = 1;
    int actual = persona.calcularIMC();

    assertEquals(expected, actual);
  }
}