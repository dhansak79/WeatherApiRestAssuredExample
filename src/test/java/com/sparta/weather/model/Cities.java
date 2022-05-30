package com.sparta.weather.model;

import java.util.List;

public class Cities {

  private final List< City > cities;

  public Cities( List< City > cities ) {
    this.cities = cities;
  }

  public List< City > getCities() {
    return cities;
  }

  @Override
  public String toString() {
    return "Cities{" +
            "cities=" + cities +
            '}';
  }
}
