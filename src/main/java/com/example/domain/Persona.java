package com.example.domain;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Random;

public class Persona {
  private String nombre = "";
  private int edad = 0;
  private String NSS = "";
  private String sexo = "H";
  private double peso = 0;
  private double altura = 0;
  private static final int MAYORIA_EDAD = 18;

  public Persona() {
    this.NSS = generateNSS();
  }

  public Persona(String nombre, int edad, String sexo, double peso, double altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
    this.NSS = generateNSS();
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public int calcularIMC() {
    if (Objects.equals(sexo, "M")) {
      return new WomanCalculateIMC().calculate(altura, peso);
    } else {
      return new MenCalculateIMC().calculate(altura, peso);
    }
  }

  public boolean esMayorDeEdad() {
    return edad >= MAYORIA_EDAD;
  }

  private boolean comprobarSexo() {
    return true;
  }

  private String generateNSS() {
    int leftLimit = 48;
    int rightLimit = 122;
    int targetStringLength = 8;
    Random random = new Random();

    return random.ints(leftLimit, rightLimit + 1)
        .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
        .limit(targetStringLength)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }

  // TODO: 1/12/2022 remember implement toString method
}
