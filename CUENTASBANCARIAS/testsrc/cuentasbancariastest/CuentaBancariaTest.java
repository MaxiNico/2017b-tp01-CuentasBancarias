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
	
	@Test
	public void testSumarSaldo(){
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		
		cuenta1.sumarSaldo(3000);
		
		assertEquals(3000, cuenta1.getSaldo(), 0);
	}
	
	@Test
	public void testRestarSaldo(){
		
		CuentaBancaria cuenta1 = new CuentaBancaria(1000);
		cuenta1.restarSaldo(500);
		assertEquals(500, cuenta1.getSaldo(), 0);
	}
	
	@Test
	public void testTransferirMontoHacia(){
		CuentaBancaria cuenta1 = new CuentaBancaria(1000);
		CuentaBancaria cuenta2 = new CuentaBancaria();
		
		assertTrue(!cuenta1.transferirMontoHacia(1100,cuenta2));
//		cuenta1.transferirMontoHacia(500,cuenta2);
//		assertEquals(cuenta1.getSaldo(), cuenta2.getSaldo(),0);
			
	}
}






