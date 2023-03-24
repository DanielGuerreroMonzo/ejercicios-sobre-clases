package ejercicios_sobre_clases;

public class Cuenta {
	private String titular;
	private double cantidad;
	public Cuenta(String nuevotitular,double nuevacantidad){
		this.titular=titular;
		this.cantidad=cantidad;
	}	
	
	
	public Cuenta(String titular){		
		this.titular=titular;	
	}
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
