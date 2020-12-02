package com.reportes.repositorio;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.reportes.model.Incidencia;
import com.reportes.model.Operador;

@Component
public class IncidenciasRepositorio {
	
	
	public List<Incidencia> incidencias = Arrays.asList(
			new Incidencia(1, "Incidencia 1. Máquina sin antivirus", new Date(), new Operador(1, "John Doe")),
			new Incidencia(2, "Incidencia 2. Máquina descompuesta", new Date(), new Operador(1, "John Doe"))
			
			);
	
	public List<Incidencia> getIncidencias() {
		return incidencias;
	}
	
	public boolean addIncidencia(Incidencia incidencia) {
		return incidencias.add(incidencia);
	}

}
