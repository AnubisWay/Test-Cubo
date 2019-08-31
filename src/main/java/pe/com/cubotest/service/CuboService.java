package pe.com.cubotest.service;

import pe.com.cubotest.dto.CuboRequest;
import pe.com.cubotest.dto.CuboResponse;

public interface CuboService {

	CuboResponse procesarCubo(CuboRequest cubo);
}
