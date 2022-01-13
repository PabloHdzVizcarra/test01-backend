package com.example.component;

import java.util.Objects;
import java.util.Scanner;

public class ConsoleInputForm implements InputForm {
  private final Scanner scanner = new Scanner(System.in);

  @Override
  public String requireName() throws RuntimeException {
    System.out.println(
        "Ingresa tu nombre, el nombre debe ser valido y tener mas de 2 caracteres:");

    String name = scanner.nextLine();

    while (name == null || name.length() < 3) {
      System.out.println("ingresaste un nombre invalido, vuelve a intentarlo");
      name = scanner.nextLine();
    }

    return name;
  }

  @Override
  public int requireAge() {
    System.out.println("Ingresa tu edad:");

    int age = Integer.parseInt(scanner.nextLine());

    while (age <= 0) {
      System.out.println("ingresaste una edad invalida, vuelve a intentarlo");
      age = Integer.parseInt(scanner.nextLine());
    }

    return age;
  }

  @Override
  public char requireSex() {
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
  public double requireWeight() {
    System.out.println("Ingresa tu peso en kilogramos:");
    double weight = Double.parseDouble(scanner.nextLine());

    while (weight <= 0) {
      System.out.println("ingresaste tu peso de manera incorrecta");
      weight = Double.parseDouble(scanner.nextLine());
    }

    return weight;
  }

  @Override
  public double requireHeight() {
    System.out.println("Ingresa tu altura en metros:");
    double height = Double.parseDouble(scanner.nextLine());

    while(height <= 0) {
      System.out.println("ingresaste tu altura de manera incorrecta");
      height = Double.parseDouble(scanner.nextLine());
    }

    return height;
  }
}
