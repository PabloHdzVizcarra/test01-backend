package com.example.component;

import com.example.domain.Persona;

public class FormComponent {
  private final EntradaFormulario inputForm;

  public FormComponent(EntradaFormulario inputForm) {
    this.inputForm = inputForm;
  }

  public Persona iniciar() {
    String name = inputForm.solicitarNombre();
    int age = inputForm.solicitarEdad();
    char genre = inputForm.solicitarSexo();
    double weight = inputForm.solicitarPeso();
    double height = inputForm.solicitarAltura();

    return new Persona(name, age, genre, weight, height);
  }

  public boolean preguntarAlUsuarioVolverAEjecutarPrograma() {
    return inputForm.volverEjecutarPrograma();
  }

  public void cerrarFormulario() {
    inputForm.cerrarFormulario();
  }
}
