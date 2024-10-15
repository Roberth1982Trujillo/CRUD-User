package com.crud.usuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.usuario.entity.Rubro;
import com.crud.usuario.repository.IRubroRepository;

@Service
public class RubroServiceImplement implements IRubroService  {

	@Autowired
	private IRubroRepository repositorio;
	
	@Override
	public List<Rubro> listarRubros() {		
		return repositorio.findAll();
	}

	@Override
	public Rubro guardarRubro(Rubro rubro) {	
		return repositorio.save(rubro);
	}

	@Override
	public Optional<Rubro> buscarRubro(int codigo) {
		return repositorio.findById(codigo);
	}

	@Override
	public void eliminarRubro(int codigo) {
		repositorio.deleteById(codigo);
	}
}