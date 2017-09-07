package cuentasbancariastest;

import cuentasbancarias.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaBancariaTest {

	
	@Test
	public void testGetSaldo() {
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		CuentaBancaria cuenta2 = new CuentaBancaria(200);
		
		assertEquals(0, cuenta1.getSaldo(), 0);  //Se usa el Delta por la impresicion cuando se comparan dos double, o algo asi
		
		assertEquals(200, cuenta2.getSaldo(), 0);
		
		
	}

}