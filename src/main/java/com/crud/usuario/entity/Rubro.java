package com.crud.usuario.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "rubros")
public class Rubro {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String descripcion;

    @OneToMany(mappedBy = "rubro", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Articulo> articulos;

	public Rubro() { }

	public Rubro(Long codigo, String descripcion, List<Articulo> articulos) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.articulos = articulos;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
}