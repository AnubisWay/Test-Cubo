package pe.com.cubotest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.cubotest.dto.CuboRequest;
import pe.com.cubotest.dto.CuboResponse;
import pe.com.cubotest.service.CuboService;

@RestController
@RequestMapping
public class RestCuboController {

	@Autowired
	CuboService cuboService;
	
	@PostMapping("/cubo")
	public CuboResponse matrizCubo(@RequestBody CuboRequest cubo) {
		return cuboService.procesarCubo(cubo);
	}
}
