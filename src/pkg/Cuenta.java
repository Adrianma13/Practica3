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
		saldo-=i;
		
	}
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
	public void ingresar(Double i) {
		saldo+= i;
		
	}
	public void setSaldo(Double i) {
		// TODO Auto-generated method stub
		saldo=i;
	}

}
