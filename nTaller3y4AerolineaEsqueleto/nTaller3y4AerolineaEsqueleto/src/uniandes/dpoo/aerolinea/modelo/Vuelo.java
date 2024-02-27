package uniandes.dpoo.aerolinea.modelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import java.util.ArrayList;
import java.util.Collection;

public class Vuelo {

	private String fecha;
	public Ruta ruta;
	public Avion avion;
	public Cliente Cliente;
	Collection<Tiquete> Tiquetes = new ArrayList<>();
		
	public Ruta getRuta() {
		return this.ruta;
	}
	
	public String getFecha() {
		return this.fecha;
	}
	
	public Avion getAvion() {
		return this.avion;
	}
	
	public Collection<Tiquete> getTicketes(){
		return this.Tiquetes;
	}
	
	public int venderTicketes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean chequeo = false;
		if(obj instanceof Vuelo) {
			Vuelo comparaVuelo = (Vuelo) obj;
			if(this.fecha.equals(comparaVuelo.getFecha()) && this.ruta.equals(comparaVuelo.getRuta()) && this.avion.equals(comparaVuelo.getAvion())) {
				chequeo = true;
			}
		}
		return chequeo;
	}
}