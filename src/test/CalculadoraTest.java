package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void Sumatest() {
		assertEquals(5, Calculadora.suma(2,3));
	}
	@Test
	void Restatest() {
		assertEquals(5, Calculadora.resta(10,5));
	}
	@Test
	void Multiplicaciontest() {
		assertEquals(6, Calculadora.multiplicacion(3,2));
		
	}
	@Test
	void Divisiontest() {
		assertEquals(6, Calculadora.division(12,2));
	}/*
	@Test
	void DivisionEntreCerotest() {
		assertEquals(-1, Calculadora.division(12,0));
	}
*/

}
