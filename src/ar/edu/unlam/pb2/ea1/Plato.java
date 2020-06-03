package ar.edu.unlam.pb2.ea1;


import java.util.ArrayList;
import java.util.Iterator;

public class Plato {

	/** Por ejemplo, si para un Plato se necesitan DOS (2) tomates,
	se deberá agregar DOS(2) unidades de tomate. 
	*/
	private String nombre;
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
	public Plato(String nombre) {
		this.nombre = nombre;
	}
	
	public Boolean agregarIngrediente(Ingrediente ingrediente)
	{
		return ingredientes.add(ingrediente);
	}
	
	public Integer obtenerCantidadaDeSal(){
		Integer cantidadTotalSal = 0;
		Iterator <Ingrediente> it= ingredientes.iterator();
		while(it.hasNext())
		{
			Ingrediente i = it.next();
			
			cantidadTotalSal += i.getCantidadSal();
		}
		return cantidadTotalSal;	
	}
	
	public Integer obtenerCantidadDeAzucar(){
		Integer cantidadTotalAzucar = 0;
		Iterator <Ingrediente> it= ingredientes.iterator();
		while(it.hasNext())
		{
			Ingrediente i = it.next();
			
			cantidadTotalAzucar += i.getCantidadAzucar();
		}
		return cantidadTotalAzucar;		
	}
}
