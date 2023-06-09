package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void test() {
		Persona juan = new Persona("Juan", new FechaCorta(LocalDate.now()));

		String valorEsperado = "09-06-2023";
		assertEquals(valorEsperado, juan.fechaNacimiento());
	}

	@Test
	void testFechaLarga() {
		Persona juan = new Persona("Juan", new FechaLarga(LocalDate.now()));

		String valorEsperado = "9 de junio de 2023";
		assertEquals(valorEsperado, juan.fechaNacimiento());
	}

}
