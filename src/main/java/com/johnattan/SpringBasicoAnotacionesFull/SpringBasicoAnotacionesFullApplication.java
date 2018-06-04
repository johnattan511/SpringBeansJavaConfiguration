package com.johnattan.SpringBasicoAnotacionesFull;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import interfaces.EquipoFutbolAnotacionesFull;

@SpringBootApplication
public class SpringBasicoAnotacionesFullApplication {

	public static void main(String[] args) {
		
		//SpringApplication.run(SpringBasicoAnotacionesFullApplication.class, args);
		AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext();
		ap.register(ConfiguracionAnotaciones.class);
		ap.refresh();
		
		ContenedorPrincipal contenedor = ap.getBean(ContenedorPrincipal.class);
		
		contenedor.getEquipo().nombre();
		ap.stop();
		
	}
}
