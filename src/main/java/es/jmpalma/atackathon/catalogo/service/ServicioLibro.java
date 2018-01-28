package es.jmpalma.atackathon.catalogo.service;

import java.util.List;

import es.jmpalma.atackathon.catalogo.dto.Libro;

public interface ServicioLibro {

	List<Libro> obtenerListaLibros();
	
	Libro obtenerLibro(Integer id);
	
	List<Libro> obtenerLibrosFavoritos();
	
	void actualizarLibro(Libro libro);
	
	void eliminarLibro(Integer id);
}
