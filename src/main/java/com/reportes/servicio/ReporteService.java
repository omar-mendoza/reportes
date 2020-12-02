package com.reportes.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reportes.model.Incidencia;
import com.reportes.repositorio.IncidenciasRepositorio;

@Service
public class ReporteService {
	
	@Autowired
	IncidenciasRepositorio repo;
	
	public List<Incidencia> getAll() {
		return repo.getIncidencias();
	}

	public Incidencia getReporte(Integer id) {
		List<Incidencia> incidenciaList = repo.getIncidencias().stream().filter(e -> e.getId() == id)
				.collect(Collectors.toList());
		
		if(!incidenciaList.isEmpty()) {
			return incidenciaList.get(0);
		}
		
		return new Incidencia();
	}
	
	public List<Incidencia> getIncidenciaPorOperador(Integer id) {

		List<Incidencia> incidenciaList = repo.getIncidencias().stream().filter(e -> e.getOperador().getId() == id)
				.collect(Collectors.toList());
		
		if(!incidenciaList.isEmpty()) {
			return incidenciaList;
		}
		
		return new ArrayList<>();
		
	}
	
	public boolean addIncidencias(Incidencia incidencia) {
		return repo.addIncidencia(incidencia);
	}
	
}
