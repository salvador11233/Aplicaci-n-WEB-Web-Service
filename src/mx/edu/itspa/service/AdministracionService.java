package mx.edu.itspa.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import mx.edu.itspa.dto.Administracion;


@WebService
public interface AdministracionService {
	@WebMethod(operationName="getAdministracion")
	@WebResult(name="ResultadoOperacion") Administracion[] getAdministracion();
}
