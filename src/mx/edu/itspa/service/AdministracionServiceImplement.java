package mx.edu.itspa.service;

import java.util.List;

import mx.edu.itspa.dao.AdministracionDAO;
import mx.edu.itspa.dto.Administracion;
import mx.edu.itspa.general.DAOException;

public class AdministracionServiceImplement implements AdministracionService {

	@Override
	public Administracion[] getAdministracion() {
		// TODO Auto-generated method stub
		List<Administracion> adminis = null;
		try {
			adminis= new AdministracionDAO().obtenerTodos();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adminis.toArray(new Administracion[adminis.size()]);
	}

}
