package controlador;

import modelo.Bancaria;

public class PrincipalMoneo {

	public static void main(String[] args) {
		
		Bancaria cuentaKaki=new Bancaria("CuentadeInaki", 500, 2500);
		
		cuentaKaki.ingreso(500);
		
		System.out.println("Sr. Majano, su saldo actual es de "+cuentaKaki.getSaldo()+" euros.");
		
		cuentaKaki.retirada(500);
		
		System.out.println("\nSr Majano, su saldo actual es de "+cuentaKaki.getSaldo()+" euros.");

	}

}
