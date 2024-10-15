package com.crud.usuario.service;

import java.util.List;
import java.util.Optional;
import com.crud.usuario.entity.Rubro;

public interface IRubroService {
	public List<Rubro> listarRubros();
	public Rubro guardarRubro(Rubro rubro);
	public Optional<Rubro> buscarRubro(int codigo);
	public void eliminarRubro(int codigo);
}
