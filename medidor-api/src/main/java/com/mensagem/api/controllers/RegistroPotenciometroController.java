package com.mensagem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mensagem.api.entities.RegistroPotenciometro;
import com.mensagem.api.services.RegistroPotenciometroService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/registro")
public class RegistroPotenciometroController {
	
	@Autowired
	private RegistroPotenciometroService service;
	
	@GetMapping
	public List<RegistroPotenciometro> listar(){
		List<RegistroPotenciometro> registro = service.listarTodos();
		return registro;
	}
	
	@PostMapping
	public RegistroPotenciometro salvar(@Valid @RequestBody RegistroPotenciometro registro) {
		RegistroPotenciometro registroSalvo = service.salvar(registro);
		return registroSalvo;
	}
	

}
