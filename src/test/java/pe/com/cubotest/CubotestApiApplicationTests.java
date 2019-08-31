package pe.com.cubotest;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pe.com.cubotest.dto.CuboRequest;
import pe.com.cubotest.dto.CuboResponse;
import pe.com.cubotest.service.CuboService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CubotestApiApplicationTests {

	@Autowired
	CuboService service;

	@Test
	public void contextLoads() {
	}

	@Test
	public void matrizNxN() {
		int[][] matriz =   { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] esperado = { { 3, 6, 9 }, { 2, 5, 8 }, { 1, 4, 7 } };
		CuboRequest request = new CuboRequest();
		request.setMatriz(matriz);
		CuboResponse response = service.procesarCubo(request);
		assertArrayEquals(esperado, response.getMatrizOrdenada());
	}
	
	@Test
	public void matrizNxM() {
		int[][] matriz =   { { 1, 2, 3 }, { 4, 5, 6 }};
		CuboRequest request = new CuboRequest();
		request.setMatriz(matriz);
		CuboResponse response = service.procesarCubo(request);
		assertArrayEquals(null, response.getMatrizOrdenada());
	}

}
