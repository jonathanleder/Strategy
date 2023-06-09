package modelo;

import java.util.ArrayList;

public class CorreoArgentino implements TransporteStrategy {

	private static final int PRECIO_POR_KM = 5;
	private ArrayList<Destino> lugares;

	public CorreoArgentino(ArrayList<Destino> lugares) {
		this.lugares = lugares;
	}

	@Override
	public double calcularPrecio(double peso, String destino) {
		double precio;

		precio = calcularPrecioDestino(destino);
		precio += calcularPrecioPorKm(destino);

		return precio;
	}

	private double calcularPrecioPorKm(String destino) {
//Aca deberia solicitar al servicio externo
		for (Destino unDestino : this.lugares) {
			if (unDestino.destino().equals(destino))
				return unDestino.distancia() * PRECIO_POR_KM;
		}

		return 0;
	}

	private double calcularPrecioDestino(String destino) {
		for (Destino unDestino : this.lugares) {
			if (unDestino.destino().equals(destino))// Dentro de la listas de destino voy a tener solo los destinos con
													// monto
				// definido, en este caso solo cap federal
				return unDestino.costoDeViaje();
		}
		return 800;// Cualquer destino distinto a cap federal retorna un monto estandar

	}

}