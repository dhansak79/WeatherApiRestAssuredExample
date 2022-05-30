package com.sparta.gameofthrones.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Book {

  private String name;
  private String isbn;
  private String numberOfPages;
  @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd" )
  private Date released;

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn( String isbn ) {
    this.isbn = isbn;
  }

  public String getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages( String numberOfPages ) {
    this.numberOfPages = numberOfPages;
  }

  public Date getReleased() {
    return released;
  }

  public void setReleased( Date released ) {
    this.released = released;
  }
}
