package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public class Diabetico extends Paciente {
	public Diabetico(String nombre, String apellido, Integer dni, ArrayList<DietaDiaria> ingesta, Integer azucarEnSangre) {
		super(nombre, apellido, dni, ingesta);
		this.azucarEnSangre = azucarEnSangre;
	}

	private Integer azucarEnSangre;

	@Override
	public void agregarDietaDiaria(DietaDiaria dieta) {
		if(azucarEnSangre < 126)
		{
			
		}

	}

	public Integer getAzucarEnSangre() {
		return azucarEnSangre;
	}

	public void setAzucarEnSangre(Integer azucarEnSangre) {
		this.azucarEnSangre = azucarEnSangre;
	}
}
