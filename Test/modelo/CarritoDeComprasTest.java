package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CarritoDeComprasTest {

	@Test
	void testColectivo() {

		ArrayList<Destino> destinosDisponibles = new ArrayList<Destino>();
		ArrayList<Producto> productosDelCarrito = new ArrayList<Producto>();
		productosDelCarrito.add(new Producto("Disco ssd", 500.0, 0.20));
		productosDelCarrito.add(new Producto("Gabinete completo", 1000.0, 5.1));
		destinosDisponibles.add(new Destino("Capital Federal", 2, 1000.0));
		destinosDisponibles.add(new Destino("Gran Buenos Aires", 15, 1500.0));
		CarritoDeCompras miWeb = new CarritoDeCompras(new ColectivosSur(destinosDisponibles), productosDelCarrito);
		double valorEsperado = 3000;

		assertEquals(valorEsperado, miWeb.calcularPrecioTotal("Capital Federal"));

	}

	@Test
	void testColectivo2() {

		ArrayList<Destino> destinosDisponibles = new ArrayList<Destino>();
		ArrayList<Producto> productosDelCarrito = new ArrayList<Producto>();
		productosDelCarrito.add(new Producto("Disco ssd", 500.0, 0.20));
		productosDelCarrito.add(new Producto("Gabinete completo", 1000.0, 5.1));
		destinosDisponibles.add(new Destino("Capital Federal", 2, 1000.0));
		destinosDisponibles.add(new Destino("Gran Buenos Aires", 15, 1500.0));
		CarritoDeCompras miWeb = new CarritoDeCompras(new ColectivosSur(destinosDisponibles), productosDelCarrito);
		double valorEsperado = 5000;

		assertEquals(valorEsperado, miWeb.calcularPrecioTotal("Rosario"));

	}

	@Test
	void testCorreo() {

		ArrayList<Destino> destinosDisponibles = new ArrayList<Destino>();
		ArrayList<Producto> productosDelCarrito = new ArrayList<Producto>();
		productosDelCarrito.add(new Producto("Disco ssd", 500.0, 0.20));
		productosDelCarrito.add(new Producto("Gabinete completo", 1000.0, 5.1));
		destinosDisponibles.add(new Destino("Capital Federal", 2, 1000.0));
		destinosDisponibles.add(new Destino("Gran Buenos Aires", 15, 1500.0));
		CarritoDeCompras miWeb = new CarritoDeCompras(new CorreoArgentino(destinosDisponibles), productosDelCarrito);
		double valorEsperado = 2510;
		assertEquals(valorEsperado, miWeb.calcularPrecioTotal("Capital Federal"));

	}

	@Test
	void testCorreo2() {

		ArrayList<Destino> destinosDisponibles = new ArrayList<Destino>();
		ArrayList<Producto> productosDelCarrito = new ArrayList<Producto>();
		productosDelCarrito.add(new Producto("Disco ssd", 500.0, 0.20));
		productosDelCarrito.add(new Producto("Gabinete completo", 1000.0, 5.1));
		destinosDisponibles.add(new Destino("Capital Federal", 2, 1000.0));
		destinosDisponibles.add(new Destino("Gran Buenos Aires", 15, 1500.0));
		CarritoDeCompras miWeb = new CarritoDeCompras(new CorreoArgentino(destinosDisponibles), productosDelCarrito);
		double valorEsperado = 2300;

		assertEquals(valorEsperado, miWeb.calcularPrecioTotal("Rosario"));

	}

}
