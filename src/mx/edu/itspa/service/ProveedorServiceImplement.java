package mx.edu.itspa.service;

import java.util.List;

import mx.edu.itspa.dao.ProvedorDAO;
import mx.edu.itspa.dto.Proveedor;
import mx.edu.itspa.general.DAOException;

public class ProveedorServiceImplement implements ProveedorService {

	@Override
	public Proveedor[] getProveedor() {
		// TODO Auto-generated method stub
		List<Proveedor> proveedor = null;
		try {
			proveedor = new ProvedorDAO().obtenerTodos();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return proveedor.toArray(new Proveedor[proveedor.size()]);
	}

}
