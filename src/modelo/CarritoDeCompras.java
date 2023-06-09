package modelo;

import java.util.List;

public class CarritoDeCompras {
	private TransporteStrategy calculo;
	private List<Producto> listaProductos;

	public CarritoDeCompras(TransporteStrategy opcionDeCompra, List<Producto> lista) {
		this.calculo = opcionDeCompra;
		this.listaProductos = lista;
	}

	public double calcularPrecioTotal(String destino) {
		double precioTotal = 0;

		for (Producto producto : listaProductos) {
			precioTotal += producto.getPrecio();
		}
		precioTotal += calculo.calcularPrecio(obtenerPesoProductos(), destino);

		return precioTotal;
	}

	private double obtenerPesoProductos() {
		double peso = 0;

		for (Producto producto : listaProductos) {
			peso += producto.getPeso();
		}

		return peso;
	}
}