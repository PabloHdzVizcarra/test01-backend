package com.example.component;

import java.util.Objects;
import java.util.Scanner;

public class ConsoleInputForm implements InputForm {
  private final Scanner scanner = new Scanner(System.in);

  @Override
  public String requireName() throws RuntimeException {
    System.out.println(
        "Por favor ingresa tu nombre, el nombre debe ser valido y tener mas de 2 caracteres: ");

    String name = scanner.nextLine();

    while (name == null || name.length() < 3) {
      System.out.println("ingresaste un nombre invalido, vuelve a intentarlo");
      name = scanner.nextLine();
    }

    return name;
  }

  @Override
  public int requireAge() {
    System.out.println("Por favor ingresa tu edad: ");

    int age = Integer.parseInt(scanner.nextLine());

    while (age <= 0) {
      System.out.println("ingresaste un edad invalida, vuelve a intentarlo");
      age = Integer.parseInt(scanner.nextLine());
    }

    return age;
  }

  @Override
  public String requireSex() {
    System.out.println("por favor ingresa tu genero usa H para hombre y M para mujer: ");
    String genero = scanner.nextLine();

    while (!Objects.equals(genero, "H") && !Objects.equals(genero, "M")) {
      System.out.println("ingresaste tu genero de manera incorrecta vuelve a ingresarlo: ");
      genero = scanner.nextLine();
    }

    return genero;
  }

  @Override
  public double requireWeight() {
    System.out.println("por favor ingresa tu peso : ");
    double weight = Double.parseDouble(scanner.nextLine());

    while (weight <= 0) {
      System.out.println("ingresaste tu peso de manera incorrecta");
      weight = Double.parseDouble(scanner.nextLine());
    }

    return weight;
  }

  @Override
  public double requireHeight() {
    System.out.println("por favor ingresa tu altura : ");
    double height = Double.parseDouble(scanner.nextLine());

    while(height <= 0) {
      System.out.println("ingresaste tu altura de manera incorrecta");
      height = Double.parseDouble(scanner.nextLine());
    }

    return height;
  }
}
