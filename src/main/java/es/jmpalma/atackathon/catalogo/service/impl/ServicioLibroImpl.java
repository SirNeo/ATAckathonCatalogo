package es.jmpalma.atackathon.catalogo.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmpalma.atackathon.catalogo.dao.CatalogoDAO;
import es.jmpalma.atackathon.catalogo.dto.Libro;
import es.jmpalma.atackathon.catalogo.service.ServicioLibro;

@Service
public class ServicioLibroImpl implements ServicioLibro {

	public static final Logger log = LoggerFactory.getLogger(ServicioLibroImpl.class.getName());
	
	@Autowired
	private CatalogoDAO dao;
	
	@Override
	public List<Libro> obtenerListaLibros() {
		log.debug("obtenerListaLibros() :: inicio");
		return dao.findAll();
	}

	@Override
	public Libro obtenerLibro(Integer id) {
		log.debug("obtenerLibro() :: inicio");
		log.debug("id: " + id);
		return dao.findOne(id);
	}

	@Override
	public void actualizarLibro(Libro libro) {
		log.debug("actualizarLibro() :: inicio");
		log.debug("id: " + libro.getId());
		dao.save(libro);
	}

	@Override
	public void eliminarLibro(Integer id) {
		log.debug("eliminarLibro() :: inicio");
		log.debug("id: " + id);
		dao.delete(id);
	}

	@Override
	public List<Libro> obtenerLibrosFavoritos() {
		log.debug("obtenerLibrosFavoritos :: inicio");
		return dao.findByFavorito(true);
	}

}
