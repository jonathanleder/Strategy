package ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaCorta implements FechaStrategy {

	private LocalDate nacimiento;

	FechaCorta(LocalDate fechaNacimiento) {
		this.nacimiento = fechaNacimiento;
	}

	@Override
	public String fechaNacimiento() {

		DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String fechaCorta = this.nacimiento.format(formatoCorto);

		return fechaCorta;
	}

}
