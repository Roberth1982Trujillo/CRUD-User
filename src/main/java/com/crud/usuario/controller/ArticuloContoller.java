package com.crud.usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.usuario.entity.Articulo;
import com.crud.usuario.entity.Usuario;
import com.crud.usuario.service.IArticuloService;

@Controller
public class ArticuloContoller {
	@Autowired
	private IArticuloService servicio;
	
	@GetMapping({"/listarArticulos"})
	public String listArticulos(Model modelo) {
		modelo.addAttribute("articulos", servicio.listarArticulo());
		return "articulos";
	}
	
	@GetMapping({"/nuevoArticulo"})
	public String newArticulo(Model modelo) {
		modelo.addAttribute("articulo", new Articulo());
		return "formArticulo";
	}
	
	@PostMapping({"/saveArticulo"})
	public String saveArticulo(Articulo articulo) {
		servicio.guardarArticulo(articulo);
		return "redirect:/listarArticulos";
	}
	
	@GetMapping("/editarArticulo/{codigo}")
	public String editArticulo(@PathVariable int codigo, Model modelo) {
		modelo.addAttribute("articulo", servicio.buscarArticulo(codigo));
		return "formArticulo";
	}
	
	@GetMapping("/eliminarArticulo/{codigo}")
	public String deleteArticulo(@PathVariable int codigo) {		
		servicio.eliminarArticulo(codigo);
		return "redirect:/listarArticulos";
	}
}
