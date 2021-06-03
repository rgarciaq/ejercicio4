package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CovidTest {

static Covid cov = new Covid();

	@Test
	void testCalcularPrioridadVacunacion() {
		double resultado=cov.calcularPrioridadVacunacion(62, 1);
		double esperado=2;
		Assertions.assertEquals(esperado, resultado, 0);
	}
	
	@Test
	void testCalcularPrioridadVacunacion1() {
		double resultado=cov.calcularPrioridadVacunacion(45, 1);
		double esperado=3;
		Assertions.assertEquals(esperado, resultado, 0);
	}
	
	@Test
	void testCalcularPrioridadVacunacion2() {
		double resultado=cov.calcularPrioridadVacunacion(20, 1);
		double esperado=1;
		Assertions.assertEquals(esperado, resultado, 0);
	}

}