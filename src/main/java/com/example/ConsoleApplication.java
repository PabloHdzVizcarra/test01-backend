package com.example;

import com.example.component.ConsoleMessageComponent;
import com.example.component.FormularioPorConsola;
import com.example.component.FormComponent;
import com.example.component.MessageComponent;
import com.example.domain.Persona;

public class ConsoleApplication {
  public static void main(String[] args) {
    boolean ejecucion = true;

    FormularioPorConsola inputForm = new FormularioPorConsola();
    FormComponent formComponent = new FormComponent(inputForm);
    ConsoleMessageComponent consoleMessage = new ConsoleMessageComponent();
    MessageComponent messageComponent = new MessageComponent(consoleMessage);
    messageComponent.bienvenidaAlUsuario();

    while (ejecucion) {
      Persona persona = formComponent.iniciar();
      messageComponent.revisarPeso(persona);
      messageComponent.esMayorEdad(persona);
      messageComponent.mostrarTodaLaInformacionAgregada(persona);
      ejecucion = formComponent.preguntarAlUsuarioVolverAEjecutarPrograma();
    }

    formComponent.cerrarFormulario();
    messageComponent.despedida();
  }
}
