package pkg;

public class Cuenta {
String mNumero;
String nTitular;
Double saldo;
	public Cuenta(double saldo,String nombreCuenta) {
		this.saldo = saldo;
		this.mNumero=nombreCuenta;
		
		// TODO Auto-generated constructor stub
	}
	public void retirar(Double i) {
		if(saldo-i<-500) {
			System.out.println("Fondos insuficientes (saldo "+saldo+") en la "+
						mNumero+" para el reintegro de "+i+"euros");
		}else {
			saldo-=i;
		}
		
		
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
