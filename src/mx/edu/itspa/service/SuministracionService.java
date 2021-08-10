package mx.edu.itspa.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import mx.edu.itspa.dto.Suministracion;

@WebService
public interface SuministracionService {
	@WebMethod(operationName="getSuministracion")
	@WebResult(name="ResultadoOperacion") Suministracion[] getSuministracion();
}
