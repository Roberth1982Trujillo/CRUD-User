package com.crud.usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.usuario.entity.Articulo;
import com.crud.usuario.entity.Rubro;
import com.crud.usuario.service.IRubroService;

@Controller
public class RubroController {
	@Autowired
	private IRubroService servicio;
	
	@GetMapping({"/listarRubros"})
	public String listUsuarios(Model modelo) {
		modelo.addAttribute("rubros", servicio.listarRubros());
		return "rubros";
	}
	
	@GetMapping({"/nuevoRubro"})
	public String newArticulo(Model modelo) {
		modelo.addAttribute("rubro", new Rubro());
		return "formRubro";
	}
	
	@PostMapping({"/saveRubro"})
	public String saveRubro(Rubro rubro) {
		servicio.guardarRubro(rubro);
		return "redirect:/listarRubros";
	}
	
	@GetMapping("/editarRubro/{codigo}")
	public String editRubro(@PathVariable int codigo, Model modelo) {
		modelo.addAttribute("rubro", servicio.buscarRubro(codigo));
		return "formRubro";
	}
	
	@GetMapping("/eliminarRubro/{codigo}")
	public String deleteRubro(@PathVariable int codigo) {		
		servicio.eliminarRubro(codigo);
		return "redirect:/listarRubros";
	}
}
