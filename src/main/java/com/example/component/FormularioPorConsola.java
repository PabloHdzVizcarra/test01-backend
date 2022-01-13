package com.example.component;

import java.util.Objects;
import java.util.Scanner;

public class FormularioPorConsola implements EntradaFormulario {
  private final Scanner scanner = new Scanner(System.in);

  @Override
  public String solicitarNombre() throws RuntimeException {
    System.out.println("Ingresa tu nombre, el nombre debe ser valido y tener mas de 2 caracteres:");

    String nombre = scanner.nextLine();

    while (nombre == null || nombre.length() < 3) {
      System.out.println("ingresaste un nombre invalido, vuelve a intentarlo");
      nombre = scanner.nextLine();
    }

    return nombre;
  }

  @Override
  public int solicitarEdad() {
    System.out.println("Ingresa tu edad:");

    int edad = Integer.parseInt(scanner.nextLine());

    while (edad <= 0) {
      System.out.println("ingresaste una edad invalida, vuelve a intentarlo");
      edad = Integer.parseInt(scanner.nextLine());
    }

    return edad;
  }

  @Override
  public char solicitarSexo() {
    System.out.println("Ingresa tu genero usa H para hombre y M para mujer:");
    String genero = scanner.nextLine();

    while (!Objects.equals(genero, "H") && !Objects.equals(genero, "M")) {
      System.out.println("ingresaste tu genero de manera incorrecta vuelve a ingresarlo:");
      genero = scanner.nextLine();
    }

    return parseToChar(genero);
  }

  private char parseToChar(String genero) {
    return genero.charAt(0);
  }

  @Override
  public double solicitarPeso() {
    System.out.println("Ingresa tu peso en kilogramos:");
    double peso = Double.parseDouble(scanner.nextLine());

    while (peso <= 0) {
      System.out.println("ingresaste tu peso de manera incorrecta");
      peso = Double.parseDouble(scanner.nextLine());
    }

    return peso;
  }

  @Override
  public double solicitarAltura() {
    System.out.println("Ingresa tu altura en metros:");
    double altura = Double.parseDouble(scanner.nextLine());

    while (altura <= 0) {
      System.out.println("ingresaste tu altura de manera incorrecta");
      altura = Double.parseDouble(scanner.nextLine());
    }

    return altura;
  }

  @Override
  public boolean volverEjecutarPrograma() {
    System.out.println(
        "si deseas volver a ejecutar el programa ingresa si, de otra manera ingresa no");
    String respuesta = scanner.nextLine();

    while (respuesta == null || !respuesta.equals("si") && !respuesta.equals("no")) {
      System.out.println("por favor ingresa si o no");
      respuesta = scanner.nextLine();
    }

    return Objects.equals(respuesta, "si");
  }

  @Override
  public void cerrarFormulario() {
    scanner.close();
  }
}
