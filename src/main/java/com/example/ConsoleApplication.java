package com.example;

import com.example.component.ConsoleMessageComponent;
import com.example.component.ConsoleInputForm;
import com.example.component.FormComponent;
import com.example.component.MessageComponent;
import com.example.domain.Persona;

public class ConsoleApplication {
  public static void main(String[] args) {
    ConsoleInputForm inputForm = new ConsoleInputForm();
    FormComponent formComponent = new FormComponent(inputForm);

    ConsoleMessageComponent consoleMessage = new ConsoleMessageComponent();
    MessageComponent messageComponent = new MessageComponent(consoleMessage);

    messageComponent.bienvenidaAlUsuario();
    Persona persona = formComponent.iniciar();

    messageComponent.revisarPeso(persona);
    messageComponent.esMayorEdad(persona);
    messageComponent.mostrarTodaLaInformacionAgregada(persona);

    messageComponent.despedida();

  }
}
