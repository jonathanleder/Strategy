package modelo;

import java.util.ArrayList;

public class ColectivosSur implements TransporteStrategy {

	private ArrayList<Destino> lugares;

	public ColectivosSur(ArrayList<Destino> lugares) {
		this.lugares = lugares;
	}

	@Override
	public double calcularPrecio(double peso, String destino) {
		double precio;

		precio = calcularPrecioDestino(destino);
		precio += calcularPrecioPorPeso(peso);

		return precio;
	}

	private double calcularPrecioPorPeso(double peso) {
		if (esMayorATreinta(peso))
			return 2000;
		if (esMayorACinco(peso))
			return 500;
		return 0;
	}

//Si el destino es Capital Federal hay un costo fijo de 1000 pesos. Si el destino es
//	gran buenos aires el monto fijo es de 1500 pesos. Cualquier otro destino el monto fijo es 3000
//	pesos

	private double calcularPrecioDestino(String destino) {
		for (Destino unDestino : this.lugares) {
			if (unDestino.destino().equals(destino))// Dentro de la listas de destino voy a tener solo los destinos con
													// monto
				// definido, en este caso solo cap federal
				return unDestino.costoDeViaje();
		}
		return 3000;// Cualquer destino distinto a cap federal retorna un monto estandar

	}

	private boolean esMayorATreinta(double peso) {
		return peso > 30;
	}

	private boolean esMayorACinco(double peso) {
		return peso > 5;
	}

//	private boolean destinoValido(Destino destino) {
//		
//	}

}
