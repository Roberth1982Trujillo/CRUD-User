package com.crud.usuario.service;

import java.util.List;
import java.util.Optional;
import com.crud.usuario.entity.Articulo;

public interface IArticuloService {
	public List<Articulo> listarArticulo();
	public Articulo guardarArticulo(Articulo articulo);
	public Optional<Articulo> buscarArticulo(int codigo);
	public void eliminarArticulo(int codigo);
}
