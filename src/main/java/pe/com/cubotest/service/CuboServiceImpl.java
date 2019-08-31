package pe.com.cubotest.service;

import org.springframework.stereotype.Service;

import pe.com.cubotest.dto.CuboRequest;
import pe.com.cubotest.dto.CuboResponse;

@Service
public class CuboServiceImpl implements CuboService {

	public CuboResponse procesarCubo(CuboRequest cubo) {
		CuboResponse response = new CuboResponse();
		if(!validarMatriz(cubo.getMatriz())) {
			 response.setMatrizOrdenada(ordenarMatriz(cubo.getMatriz()));
		}
		return response;
	}
	
	/**
	 * Validar que la matriz sea NxN.
	 * 
	 * @author Walter Mayorga
	 * @param matriz
	 * @return
	 */
	private boolean validarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			if (matriz.length != matriz[i].length) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Ordenar la matriz en sentido antihorario 
	 * Transponer matriz
	 * 
	 * @author Walter Mayorga
	 * @param matriz
	 * @return
	 */
	private int[][] ordenarMatriz(int[][] matriz) {
		int n = matriz.length;
		int[][] matrizGirada = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrizGirada[i][j] = matriz[j][n - 1 - i];
			}
		}
		return matrizGirada;
	}
}
