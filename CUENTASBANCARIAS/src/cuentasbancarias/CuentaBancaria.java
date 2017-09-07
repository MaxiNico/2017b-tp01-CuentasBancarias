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
	
	public boolean restarSaldo(double saldo) {
		if( this.saldo >=saldo)
		{
			this.saldo-=saldo;
			return true;
		}
		else
			return false;		
	}
	
	public boolean transferirMontoHacia(double dinero, CuentaBancaria that){
		
		if(this.restarSaldo(dinero)){
			that.sumarSaldo(dinero);
			return true;
		}
		
		return false;
	}
}







