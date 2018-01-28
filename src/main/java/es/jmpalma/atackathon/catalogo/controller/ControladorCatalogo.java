package es.jmpalma.atackathon.catalogo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.jmpalma.atackathon.catalogo.dto.Libro;
import es.jmpalma.atackathon.catalogo.service.ServicioLibro;

@RequestMapping(value = "/catalogo/api")
@RestController
public class ControladorCatalogo {
	
	public static final Logger log = LoggerFactory.getLogger(ControladorCatalogo.class.getName());

	@Autowired
	private ServicioLibro servicio;

	@RequestMapping(value="/libros", method= RequestMethod.GET)
	public List<Libro> obtenerListaLibros() {
		log.debug("obtenerListaLibros() :: inicio");
		return servicio.obtenerListaLibros();
	}

	@RequestMapping(value = "/favoritos", method = RequestMethod.GET)
	public List<Libro> obtenerLibrosFavoritos() {
		log.debug("obtenerLibrosFavoritos()");
		return servicio.obtenerLibrosFavoritos();
	}
	
	@RequestMapping(value = "/libro/{id}", method = RequestMethod.GET)
	public Libro obtenerLibro(@PathVariable("id")Integer id) {
		log.debug("obtenerLibro()");
		return servicio.obtenerLibro(id);
	}
	
	@RequestMapping(value="/holamundo", method=RequestMethod.GET)
	public String helloWorld() {
		return "Hola Mundo";
	}
}
