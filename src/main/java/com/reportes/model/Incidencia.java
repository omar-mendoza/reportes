package com.reportes.model;

import java.util.Date;

public class Incidencia {
	
	private Integer id;
	
	private String reporte;
	
	private Date createdAt;
	
	private Operador operador;
	
	public Incidencia() {}

	public Incidencia(Integer id, String reporte, Date createdAt, Operador operador) {
		this.id = id;
		this.reporte = reporte;
		this.createdAt = createdAt;
		this.operador = operador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReporte() {
		return reporte;
	}

	public void setReporte(String reporte) {
		this.reporte = reporte;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	
}
