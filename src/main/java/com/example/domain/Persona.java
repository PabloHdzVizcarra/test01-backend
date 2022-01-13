package com.example.domain;

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
    double result = peso / (altura * altura);

    if (result < 20) {
      return DEBAJO_PESO_IDEAL;
    } else if (result >= 20 && result <= 25) {
      return PESO_IDEAL;
    } else {
      return SOBREPESO;
    }
  }

  public boolean esMayorDeEdad() {
    return true;
  }

  private boolean comprobarSexo() {
    return true;
  }

  @Override
  public String toString() {
    return "Persona{"
        + "nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + ", NSS='"
        + NSS
        + '\''
        + ", sexo='"
        + sexo
        + '\''
        + ", peso="
        + peso
        + ", altura="
        + altura
        + '}';
  }

  private String generaNSS() {
    return "";
  }
}
