package com.reportes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reportes.model.Incidencia;
import com.reportes.servicio.ReporteService;

@RestController
@RequestMapping("/reportes")
public class ReporteController {

	@Autowired
	ReporteService service;
	
	@GetMapping("/all")
	public ResponseEntity<?> get() {
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/byId/{id}")
	public ResponseEntity<?> getById(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getReporte(id));
	}
	
	@GetMapping("/byOperator/{id}")
	public ResponseEntity<?> getByOperatorId(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getIncidenciaPorOperador(id));
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addIncidencia(@RequestBody Incidencia incidencia) {
		
		Boolean flag = service.addIncidencias(incidencia);
		if(flag) {
			return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
		}
		
		return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
