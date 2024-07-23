package com.example.beans2example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class DummyPrinterManager {

  private DummyPrinter printer;

  public DummyPrinterManager() {
  }

  public DummyPrinterManager(DummyPrinter printer) {
    this.printer = printer;
  }

  public DummyPrinter getPrinter() {
    return printer;
  }

//  @Autowired
//  @Qualifier(value = "configuredPrinter2")
  public void setPrinter(DummyPrinter printer) {
    this.printer = printer;
  }

  public void onInit() {
    System.out.println("DummyPrinterManager bean created! ");
  }

  public void onDestroy() {
    System.out.println("DummyPrinterManager bean is going to be destroyed");
  }
}
