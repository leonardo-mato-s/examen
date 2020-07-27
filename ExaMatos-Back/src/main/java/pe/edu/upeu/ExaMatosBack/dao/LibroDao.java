package pe.edu.upeu.ExaMatosBack.dao;

import java.util.List;
import pe.edu.upeu.ExaMatosBack.entity.Libro;
public interface LibroDao {
	List<Libro> readAll();
}