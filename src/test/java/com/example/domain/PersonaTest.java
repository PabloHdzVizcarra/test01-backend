package com.example.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
  private Persona persona;


  @BeforeEach
  void setUp() {
    persona = new Persona();
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

  @Test
  void givenRecommendedValuesWoman_whenCalculateIMC() {
    persona = new Persona("sara", 25, "M", 69.0, 1.70);
    int expected = 0;
    int actual = persona.calcularIMC();

    assertEquals(expected, actual);
  }

  @Test
  void givenLightValuesWoman_whenCalculateIMC() {
    persona = new Persona("sara", 25, "M", 54.0, 1.70);
    int expected = -1;
    int actual = persona.calcularIMC();

    assertEquals(expected, actual);
  }

  @Test
  void givenWeightValuesWoman_whenCalculateIMC() {
    persona = new Persona("sara", 25, "M", 70, 1.70);
    int expected = 1;
    int actual = persona.calcularIMC();

    assertEquals(expected, actual);
  }
}