package pe.edu.upeu.ExaMatosBack.daoImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.ExaMatosBack.dao.LibroDao;
import pe.edu.upeu.ExaMatosBack.entity.Libro;
@Repository
public class LibroDaoImp implements LibroDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return jdbctemplate.query("select * from libro",BeanPropertyRowMapper.newInstance(Libro.class));
	}
}
