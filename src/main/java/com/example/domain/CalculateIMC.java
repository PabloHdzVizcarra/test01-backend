package com.example.domain;

public abstract class CalculateIMC {
  protected static final int DEBAJO_PESO_IDEAL = -1;
  protected static final int PESO_IDEAL = 0;
  protected static final int SOBREPESO = 1;

  abstract int calculate(double height, double weight);
}
