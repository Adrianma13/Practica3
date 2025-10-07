package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	private static Cuenta cuenta;
	private Cuenta cuenta12345;
	private Cuenta cuenta67890;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta=new Cuenta(0,"cuenta");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRetirar() {
		cuenta.retirar(500.0);
		assertEquals(-500, cuenta.getSaldo());
	}
	@Test
	void testIngresar() {
		cuenta.ingresar(500.0);
		assertEquals(500, cuenta.getSaldo());
	}
	@Test
	void test0014() {
		cuenta12345=new Cuenta(50,"12345");
		cuenta67890=new Cuenta(0,"67890");
		
		cuenta12345.retirar(200.0);
		cuenta67890.retirar(350.0);
		cuenta12345.ingresar(100.0);
		cuenta67890.retirar(200.0);
		cuenta67890.retirar(150.0);
		cuenta12345.retirar(200.0);
		cuenta67890.ingresar(50.0);
		cuenta67890.retirar(100.0);
		
		
		
	}

}
