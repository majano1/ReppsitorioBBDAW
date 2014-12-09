package modelo;

public class cuenta {

	    private double saldo;

	    public cuenta (double saldo){
	        this.saldo = saldo ;

	    }
	    public double sal (double saldo){
	        this.saldo = saldo;
	        return this.saldo;

	    }
	    public double reti (double retiro){
	        this.saldo=this.saldo-retiro;
	        return this.saldo;
	    }
	    public double depos (double deposito){
	        this.saldo=this.saldo+deposito;
	        return saldo;
	    }

	}

