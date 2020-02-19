import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
Calculadora c;	
	@Before
	public void before() {
		System.out.println("Ejecutando el before");
		c = new Calculadora();
	}
	@Test
	public void SumaTest() {
		System.out.println("Ejecutando SumaTest");
		int resultado = c.suma(2, 3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void RestaTest() {
		System.out.println("Ejecutando RestaTest");
		int resultado = c.resta(6, 2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

}
