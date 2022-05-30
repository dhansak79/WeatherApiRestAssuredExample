package com.sparta.weather.model;

public class City {

  String name;
  String lat;
  String lon;

  public String getName() {
    return name;
  }

  public String getLatitude() {
    return lat;
  }

  public String getLongitude() {
    return lon;
  }

  public void setName( String name ) {
    this.name = name;
  }

  public void setLat( String lat ) {
    this.lat = lat;
  }

  public void setLon( String lon ) {
    this.lon = lon;
  }

  @Override
  public String toString() {
    return "City{" +
            "name='" + name + '\'' +
            ", latitude='" + lat + '\'' +
            ", longitude='" + lon + '\'' +
            '}';
  }
}
