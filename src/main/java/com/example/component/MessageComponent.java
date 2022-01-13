package com.example.component;

import com.example.domain.Persona;

public class MessageComponent {
  private final OutPutMessageComponent outPutMessageComponent;

  public MessageComponent(OutPutMessageComponent outPutMessageComponent) {
    this.outPutMessageComponent = outPutMessageComponent;
  }

  public void bienvenidaAlUsuario() {
    outPutMessageComponent.greetUser();
  }

  public void revisarPeso(Persona persona) {
    outPutMessageComponent.checkIMC(persona.calcularIMC());
  }

  public void esMayorEdad(Persona persona) {
    outPutMessageComponent.esMayorEdad(persona.esMayorDeEdad());
  }

  public void mostrarTodaLaInformacionAgregada(Persona persona) {
    outPutMessageComponent.mostrarTodaLaInformacionAgregada(persona.toString());
  }

  public void despedida() {
    outPutMessageComponent.despedida();
  }


}
