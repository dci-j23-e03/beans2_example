package com.example.beans2example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.example.beans2example")
public class Bean2Config {

//  @Bean
//  public DummyPrinterManager dummyPrinterManager() {
//    DummyPrinter dummyPrinter = configuredPrinter2();
//    return new DummyPrinterManager(dummyPrinter);
//  }

  @Bean(value = "printerManager", initMethod = "onInit", destroyMethod = "onDestroy")
//  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  public DummyPrinterManager dummyPrinterManager(DummyPrinter dummyPrinter) {
    return new DummyPrinterManager(dummyPrinter);
  }

  @Bean(name = "configuredPrinter", autowireCandidate = true)
  @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
  public DummyPrinter configuredPrinter() {
    DummyPrinter configuredPrinter = new DummyPrinter();
    configuredPrinter.setMessage("Hello everybody from configured bean!");
    return configuredPrinter;
  }

  @Primary
  @Bean(initMethod = "onInit", destroyMethod = "onDestroy")
//  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  public DummyPrinter configuredPrinter2() {
    DummyPrinter configuredPrinter = new DummyPrinter();
    configuredPrinter.setMessage("Hello everybody from configured bean number 2!");
    return configuredPrinter;
  }
}
