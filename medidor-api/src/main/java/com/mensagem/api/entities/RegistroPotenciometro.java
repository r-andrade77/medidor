package com.mensagem.api.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RegistroPotenciometro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "valor_potenciometro")
	int valorPotenciometro;
	
	@Column(name = "leds_acesos")
	int ledsAcesos;
	
	@Column(name = "data_hora_registro")
	LocalDateTime dataHoraRegistro;
	
	public RegistroPotenciometro() {
		
	}

	public RegistroPotenciometro(Long id, int valorPotenciometro, int ledsAcesos, LocalDateTime dataHoraRegistro) {
		super();
		this.id = id;
		this.valorPotenciometro = valorPotenciometro;
		this.ledsAcesos = ledsAcesos;
		this.dataHoraRegistro = dataHoraRegistro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getValorPotenciometro() {
		return valorPotenciometro;
	}

	public void setValorPotenciometro(int valorPotenciometro) {
		this.valorPotenciometro = valorPotenciometro;
	}

	public int getLedsAcesos() {
		return ledsAcesos;
	}

	public void setLedsAcesos(int ledsAcesos) {
		this.ledsAcesos = ledsAcesos;
	}

	public LocalDateTime getDataHoraRegistro() {
		return dataHoraRegistro;
	}

	public void setDataHoraRegistro(LocalDateTime dataHoraRegistro) {
		this.dataHoraRegistro = dataHoraRegistro;
	}
	
	
}
