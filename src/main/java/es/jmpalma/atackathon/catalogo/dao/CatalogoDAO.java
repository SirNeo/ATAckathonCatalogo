package es.jmpalma.atackathon.catalogo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.jmpalma.atackathon.catalogo.dto.Libro;

@Repository
public interface CatalogoDAO extends JpaRepository<Libro, Integer> {
	
	public List<Libro> findByFavorito(boolean favorito);
}
