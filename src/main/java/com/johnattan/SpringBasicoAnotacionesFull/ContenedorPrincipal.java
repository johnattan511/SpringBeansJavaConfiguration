package com.johnattan.SpringBasicoAnotacionesFull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import interfaces.EquipoFutbolAnotacionesFull;

public class ContenedorPrincipal {
     
	@Autowired
	@Qualifier(value="obtenerChelsea")
	private EquipoFutbolAnotacionesFull equipo;

	public EquipoFutbolAnotacionesFull getEquipo() {
		return equipo;
	}

	public void setEquipo(EquipoFutbolAnotacionesFull equipo) {
		this.equipo = equipo;
	}
	
	
}
