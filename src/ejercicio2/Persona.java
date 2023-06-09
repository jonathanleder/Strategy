package ejercicio2;

public class Persona {
	private String nombre;
	private FechaStrategy fechaNacimiento;

	Persona(String nombre, FechaStrategy fecha) {
		this.nombre = nombre;
		this.fechaNacimiento = fecha;
	}

	public String nombre() {
		return this.nombre;
	}

	public String fechaNacimiento() {
		return this.fechaNacimiento.fechaNacimiento();
	}

}
