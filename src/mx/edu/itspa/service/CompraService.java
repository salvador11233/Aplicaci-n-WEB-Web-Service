package mx.edu.itspa.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import mx.edu.itspa.dto.Compra;

@WebService
public interface CompraService {
	@WebMethod(operationName="getCompras")
	@WebResult(name="ResultadoOperacion") Compra[] getCompras();
}
