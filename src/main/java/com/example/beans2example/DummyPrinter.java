package com.example.beans2example;

public class DummyPrinter {
  private String message = "Hello everybody!";

  public void printDummyMessage() {
    System.out.println(message);
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void onInit() {
    System.out.println("DummyPrinter bean created!");
  }

  public void onDestroy() {
    System.out.println("DummyPrinter bean is going to be destroyed");
  }
}
