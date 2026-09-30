package com.mensagem.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mensagem.api.entities.RegistroPotenciometro;
import com.mensagem.api.repositories.RegistroPotenciometroRepository;

@Service
public class RegistroPotenciometroService {

	@Autowired
	private RegistroPotenciometroRepository repository;
	
	public List<RegistroPotenciometro> listarTodos(){
		return repository.findAll();
	}
	
	public RegistroPotenciometro salvar(RegistroPotenciometro registro) {
		return repository.save(registro);
	}
	
	public void excluir(Long id) {
		repository.deleteById(id);
	}

}
