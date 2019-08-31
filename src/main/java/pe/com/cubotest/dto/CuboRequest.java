package pe.com.cubotest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CuboRequest {
	
	@JsonProperty
	private int[][] matriz;

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

}
