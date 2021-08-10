package mx.edu.itspa.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import mx.edu.itspa.dto.Usuario;

@WebService
public interface UsuarioService {
	@WebMethod(operationName="getUsuarios")
	@WebResult(name="ResultadoOperacion") Usuario[] getUsuarios();
}
