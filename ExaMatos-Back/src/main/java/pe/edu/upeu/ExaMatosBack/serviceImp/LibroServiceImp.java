package pe.edu.upeu.ExaMatosBack.serviceImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.ExaMatosBack.dao.LibroDao;
import pe.edu.upeu.ExaMatosBack.entity.Libro;
import pe.edu.upeu.ExaMatosBack.service.LibroService;
@Service
public class LibroServiceImp implements LibroService {
	@Autowired
	private LibroDao librodao;
	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return librodao.readAll();
	}
}