package com.example.beans2example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RegularPrinterManger {

  private DummyPrinter printer;

  public RegularPrinterManger() {
  }

  public RegularPrinterManger(DummyPrinter printer) {
    this.printer = printer;
  }

  public DummyPrinter getPrinter() {
    return printer;
  }

  @Autowired
  @Qualifier(value = "configuredPrinter2")
  public void setPrinter(DummyPrinter printer) {
    this.printer = printer;
  }

}
