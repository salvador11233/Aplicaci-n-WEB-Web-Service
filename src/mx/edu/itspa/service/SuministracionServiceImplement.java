package mx.edu.itspa.service;

import java.util.List;

import mx.edu.itspa.dao.SuministracionDAO;
import mx.edu.itspa.dto.Suministracion;
import mx.edu.itspa.general.DAOException;

public class SuministracionServiceImplement implements SuministracionService {

	@Override
	public Suministracion[] getSuministracion() {
		// TODO Auto-generated method stub
		List<Suministracion> sumnistracion = null;
		try {
			sumnistracion = new SuministracionDAO().obtenerTodos();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sumnistracion.toArray(new Suministracion[sumnistracion.size()]);
	}

}
