package com.example.domain;

public class WomanCalculateIMC extends CalculateIMC {

  @Override
  int calculate(double height, double weight) {
    double result = weight / (height * height);

    if (result < 19) {
      return DEBAJO_PESO_IDEAL;
    } else if (result >= 19 && result <= 24) {
      return PESO_IDEAL;
    } else {
      return SOBREPESO;
    }

  }
}
