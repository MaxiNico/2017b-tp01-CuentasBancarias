package cuentasbancarias;

public class CuentaBancaria {
	
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public CuentaBancaria(){}
	
	public CuentaBancaria(double that){
		
		this.saldo = that;
	}

	public void sumarSaldo(double saldo) {
		this.saldo+=saldo;
	}
	
	public void restarSaldo(double saldo) {
		this.saldo-=saldo;
	}
}
