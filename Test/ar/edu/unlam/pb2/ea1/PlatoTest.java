package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertTrue;

public class PlatoTest {

	public void testQueSePuedanAgregarIngredientesIguales(){
		//creacion
		Ingrediente tomate0 = new Ingrediente("tomate", 2, 5);
		Ingrediente tomate1 = new Ingrediente("tomate", 2, 5);
		Ingrediente carnePicada = new Ingrediente("carne picada", 9, 1);
		Plato miPlato = new Plato("Salsa con carne");
		
		miPlato.agregarIngrediente(tomate0);
		assertTrue(miPlato.agregarIngrediente(tomate1));
		
	}
	public void testQueSeObtengaLaCantidadDeSalCorrecta(){
		
	}
	
	public void testQueSeObtenegaLaCanidadDeAzucarCorrecta() {
		
	}
	
}
