package com.example.component;

import com.example.domain.Persona;

public class FormComponent {
  private final InputForm inputForm;

  public FormComponent(InputForm inputForm) {
    this.inputForm = inputForm;
  }

  public Persona iniciar() {
    String name = inputForm.requireName();
    int age = inputForm.requireAge();
    char genre = inputForm.requireSex();
    double weight = inputForm.requireWeight();
    double height = inputForm.requireHeight();

    return new Persona(name, age, genre, weight, height);
  }
}
