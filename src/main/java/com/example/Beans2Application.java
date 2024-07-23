package com.example;

import com.example.beans2example.Bean2Config;
import com.example.beans2example.DummyPrinterManager;
import com.example.beans2example.RegularPrinterManger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Beans2Application {

	public static void main(String[] args) {
		SpringApplication.run(Beans2Application.class, args);

		// configuring IoC container (ApplicationContext)
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Bean2Config.class);

		// usage of objects without creating them, just taking them from IoC container (ApplicationContext)
		DummyPrinterManager dummyPrinterManager = applicationContext.getBean(
        DummyPrinterManager.class);
		dummyPrinterManager.getPrinter().printDummyMessage();
		System.out.println("DummyPrinter instance: " + dummyPrinterManager.getPrinter());

//		RegularPrinterManger regularPrinterManger = applicationContext.getBean(RegularPrinterManger.class);
//		regularPrinterManger.getPrinter().printDummyMessage();
//		System.out.println("DummyPrinter instance: " + regularPrinterManger.getPrinter());
	}
}
