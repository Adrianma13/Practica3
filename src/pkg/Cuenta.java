package pkg;

public class Cuenta {
String mNumero;
String nTitular;
Double saldo;
	public Cuenta(double saldo) {
		this.saldo = saldo;
		
		// TODO Auto-generated constructor stub
	}
	public void retirar(Double i) {
		saldo=-500.0;
		
	}
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
	public void ingresar(Double i) {
		saldo=500.0;
		
	}

}
