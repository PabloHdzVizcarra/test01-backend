package com.example.domain;

public class MenCalculateIMC extends CalculateIMC {

  @Override
  int calculate(double height, double weight) {
    double result = weight / (height * height);

    if (result < 20) {
      return DEBAJO_PESO_IDEAL;
    } else if (result >= 20 && result <= 25) {
      return PESO_IDEAL;
    } else {
      return SOBREPESO;
    }
  }
}
