package mx.edu.itspa.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import mx.edu.itspa.dto.Proveedor;

@WebService
public interface ProveedorService {
	
	@WebMethod(operationName="getProveedor")
	@WebResult(name="ResultadoOperacion") Proveedor[] getProveedor();
}
