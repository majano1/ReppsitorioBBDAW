package controlador;

import modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		Cuenta cuentaKaki = new Cuenta("Kaki Majano", 1,2000F);
		Cuenta cuentaMama = new Cuenta("Mama", 2,200F);
		
		//sacando dinero
		cuentaKaki.reintegro(100F);
		
		System.out.println("Su saldo Sr Majano: "+cuentaKaki.getSaldo()+"€");
		
		//Transferencia a Mama
		cuentaKaki.transferencia(cuentaMama, 200F);
		System.out.println("Su saldo Sr Majano: "+cuentaKaki.getSaldo()+"€");
		System.out.println("Su saldo Sra. Mama: "+cuentaMama.getSaldo()+"€");
		
		//valor personalidado de la cuenta ¡siempre con set!
		
		//cuenta.setSaldo(1000.0F);
		
		//System.out.println(cuenta.getSaldo());

	}

}
