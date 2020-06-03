package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public class Hipertenso extends Paciente{
	
	public Hipertenso(String nombre, String apellido, Integer dni, ArrayList<DietaDiaria> ingesta,Integer presionMinima, Integer presionMaxima) {
		super(nombre, apellido, dni, ingesta);
		this.prensionMinima = presionMinima;
		this.presionMaxima = presionMaxima;
		
	}
	private Integer prensionMinima = 80;
	private Integer presionMaxima = 120;
	@Override
	public void agregarDietaDiaria(DietaDiaria dieta) {
		if(presionMaxima < 120 & prensionMinima > 80)
		{
			
		}
		
	}
	public Integer getPrensionMinima() {
		return prensionMinima;
	}
	public void setPrensionMinima(Integer prensionMinima) {
		this.prensionMinima = prensionMinima;
	}
	public Integer getPresionMaxima() {
		return presionMaxima;
	}
	public void setPresionMaxima(Integer presionMaxima) {
		this.presionMaxima = presionMaxima;
	}
	
	
}
