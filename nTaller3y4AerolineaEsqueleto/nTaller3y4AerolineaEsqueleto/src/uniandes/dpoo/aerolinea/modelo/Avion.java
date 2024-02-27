package uniandes.dpoo.aerolinea.modelo;

public class Avion {

	private String nombre;
	private int capacidad;
	
	public Avion (String nombre, int capacidad) {
		//asigna los parámetros al método constructor 
		nombre = this.nombre;
		capacidad = this.capacidad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getCapacidad() {
		return this.capacidad;
	}
}
