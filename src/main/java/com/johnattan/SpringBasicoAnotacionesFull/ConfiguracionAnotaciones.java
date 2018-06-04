package com.johnattan.SpringBasicoAnotacionesFull;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beansContexto.ContextoArrancando;
import beansContexto.ContextoCerrando;
import implementacion.EquipoFutbolChelseaAnotaciones;
import implementacion.EquipoFutbolMillonariosAnotacionesFull;
import interfaces.EquipoFutbolAnotacionesFull;

@Configuration
public class ConfiguracionAnotaciones {

	@Bean
	public EquipoFutbolAnotacionesFull obtenerMillos(){
		return new EquipoFutbolMillonariosAnotacionesFull();
	}
	
	@Bean
	public EquipoFutbolAnotacionesFull obtenerChelsea(){
		return new EquipoFutbolChelseaAnotaciones();
	}
	
	@Bean
	public ContenedorPrincipal obtenerContenedor(){
		return new ContenedorPrincipal();
	}
	
	@Bean
	public ContextoArrancando obtenerContextoArranque(){
		return new ContextoArrancando();
	}
	
	@Bean
	public ContextoCerrando obtenerContextoCierre(){
		return new ContextoCerrando();
	}
}
