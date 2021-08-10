package mx.edu.itspa.service;

import java.util.List;

import mx.edu.itspa.dao.CompraDAO;
import mx.edu.itspa.dto.Compra;
import mx.edu.itspa.general.DAOException;

public class CompraServiceImplement implements CompraService{

	@Override
	public Compra[] getCompras() {
		// TODO Auto-generated method stub
		List<Compra> compra = null;
		try {
			compra = new CompraDAO().obtenerTodos();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return compra.toArray(new Compra[compra.size()]);
	}

}
