package modelo;

public class Bancaria {
	public String nombre;
	public double ncuenta;
	public float saldo;

	public Bancaria(String nombre, double ncuenta, float saldo) {
		
		this.nombre=nombre;
		this.ncuenta=ncuenta;
		this.saldo=saldo;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNcuenta() {
		return ncuenta;
	}

	public void setNcuenta(double ncuenta) {
		this.ncuenta = ncuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void ingreso(int cantidad) {
		saldo=saldo+cantidad;
	}
	
	public void retirada(int cantidad) {
		if (saldo>=cantidad) {
			saldo=saldo-cantidad;
		}else {
			System.out.println("No puedes retirar el dinero");
		}
	}
}
