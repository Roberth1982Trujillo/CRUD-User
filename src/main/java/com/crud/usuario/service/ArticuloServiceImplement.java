package com.crud.usuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.usuario.entity.Articulo;
import com.crud.usuario.repository.IArticuloRepository;

@Service
public class ArticuloServiceImplement implements IArticuloService {

	@Autowired
	private IArticuloRepository repositorio;
	
	@Override
	public List<Articulo> listarArticulo() {
		return repositorio.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return repositorio.save(articulo);
	}

	@Override
	public Optional<Articulo> buscarArticulo(int codigo) {
		return repositorio.findById(codigo);
	}

	@Override
	public void eliminarArticulo(int codigo) {
		repositorio.deleteById(codigo);
	}
}