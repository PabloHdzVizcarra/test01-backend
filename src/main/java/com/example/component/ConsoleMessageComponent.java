package com.example.component;

public class ConsoleMessageComponent implements OutPutMessageComponent {

  @Override
  public void greetUser() {
    System.out.println(
        "Bienvenido a esta aplicacion que te ayudara a saber si tu peso es el ideal.");

    System.out.println(
        "A continuacion se te pedira proporcionar informacion para poder calcular "
            + "tus estadisticas");

    System.out.println(
        "en cualquier momento puedes teclear 'cancelar' para interrumpir la "
            + "operacion del programa");
  }

  @Override
  public void checkIMC(int i) {
    switch (i) {
      case -1:
        System.out.println("Estas por debajo de tu peso ideal");
        break;
      case 0:
        System.out.println("Felicidades estas en tu peso ideal");
        break;
      case 1:
        System.out.println("Tienes sobrepreso");
        break;
      default:
        System.out.println("operacion no valida");
    }
  }

  @Override
  public void esMayorEdad(boolean esMayorDeEdad) {
    if (!esMayorDeEdad) {
      System.out.println("No eres mayor de edad");
    } else {
      System.out.println("Eres mayor edad");
    }
  }

  @Override
  public void mostrarTodaLaInformacionAgregada(String toString) {
    System.out.println("A continuacion se muestran todos tus datos ingresados:");
    System.out.println(toString);
  }

  @Override
  public void despedida() {
    System.out.println();
    System.out.println("Gracias por haber usado esta aplicacion hasta pronto...");
  }
}
