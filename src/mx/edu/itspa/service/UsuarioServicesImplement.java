package mx.edu.itspa.service;

import java.util.List;

import mx.edu.itspa.dao.UsuarioDAO;
import mx.edu.itspa.dto.Usuario;
import mx.edu.itspa.general.DAOException;

public class UsuarioServicesImplement implements UsuarioService {

	@Override
	public Usuario[] getUsuarios() {
		// TODO Auto-generated method stub
		List<Usuario> usuarios = null;
		try {
			usuarios = new UsuarioDAO().obtenerTodos();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuarios.toArray(new Usuario[usuarios.size()]);
	}

}
