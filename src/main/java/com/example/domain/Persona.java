package com.example.domain;

import java.util.Objects;

public class Persona {
  private String nombre = "";
  private int edad = 0;
  private String NSS = "";
  private String sexo = "H";
  private double peso = 0;
  private double altura = 0;
  private static final int DEBAJO_PESO_IDEAL = -1;
  private static final int PESO_IDEAL = 0;
  private static final int SOBREPESO = 1;

  public Persona() {}

  public Persona(String nombre, int edad, String sexo, double peso, double altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
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
    return true;
  }

  private boolean comprobarSexo() {
    return true;
  }

  private String generaNSS() {
    return "";
  }

  // TODO: 1/12/2022 remember implement toString method
}
