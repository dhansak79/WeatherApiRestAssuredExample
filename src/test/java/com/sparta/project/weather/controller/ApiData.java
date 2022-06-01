package com.sparta.project.weather.controller;

import java.util.List;
import java.util.Optional;

public interface ApiData<T> {
  T getData();

  List<T> getData( String s);
}
