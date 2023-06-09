package ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FechaLarga implements FechaStrategy {

	private LocalDate nacimiento;

	FechaLarga(LocalDate fechaNacimiento) {
		this.nacimiento = fechaNacimiento;
	}

	@Override
	public String fechaNacimiento() {

		DateTimeFormatter formatoLargo = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String fechaLarga = this.nacimiento.format(formatoLargo);
		return fechaLarga;
	}

}