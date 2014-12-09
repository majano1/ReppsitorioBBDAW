package modelo1;

public class Cuenta {
	private String titular;
	private long ncta;
	private float saldo;
	
	//constructor
	
	public Cuenta(String titular, long ncta) {
		this.titular=titular;
		this.ncta=ncta;
		this.saldo=0.0F; //float
		
	}
	
	public Cuenta(String titular, long ncta, float saldo) {
		this.titular=titular;
		this.ncta=ncta;
		this.saldo=saldo;
		
	}
	
	//source > getters and setters y sale esto:

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public long getNcta() {
		return ncta;
	}

	public void setNcta(long ncta) {
		this.ncta = ncta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//definir asugnatura del metodo para hacer los ingresos del dinero... (ay Dios!)
	
	public void ingreso(float cantidad) {
		saldo+=cantidad; //se puede poner el this aqui, pero no hace falta
		
	}
	
	public void reintegro(float cantidad) {
		if (saldo>=cantidad)
			saldo-=cantidad; //se puede poner el this aqui, pero no hace falta
		else
			System.out.println("No hay saldo suficiente");
		
	}
	
	public void transferencia(Cuenta acreedora, float cantidad) {
		
		if (saldo>=cantidad) {
			saldo-=cantidad; //se puede poner el this aqui, pero no hace falta
			acreedora.ingreso(cantidad);
		}else {
			System.out.println("No hay saldo suficiente");
		}
		
	}
	
}
