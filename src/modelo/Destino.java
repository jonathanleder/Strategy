package modelo;

public class Destino {

	private String nombre;
	private int distanciaEnKmACapital;
	private double costo;

	Destino(String nombre, int distanciaACapital, double costo) {
		this.nombre = nombre;
		this.distanciaEnKmACapital = distanciaACapital;
		this.costo = costo;
	}

	public int distancia() {
		return this.distanciaEnKmACapital;
	}

	public String destino() {
		return this.nombre;
	}

	public double costoDeViaje() {
		return this.costo;
	}

}
