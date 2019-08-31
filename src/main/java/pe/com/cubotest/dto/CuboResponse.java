package pe.com.cubotest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CuboResponse {

	@JsonProperty
	private int[][] matrizOrdenada;

	public int[][] getMatrizOrdenada() {
		return matrizOrdenada;
	}

	public void setMatrizOrdenada(int[][] matrizOrdenada) {
		this.matrizOrdenada = matrizOrdenada;
	}

}
