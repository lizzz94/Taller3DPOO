package uniandes.dpoo.aerolinea.modelo.cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
//TODO MIRAR LO DE LA CLASE VUELO Y COMO NO HAY RELACION ENTRE ESTAS DOS CLASES

public abstract class Cliente {
	public Cliente() {
		
	}
	
	public String getTipoCliente() {
		return "tipoCliente";
	}
	
	public String getIdentificador() {
		return "id";
	}
	
	
	public void agregarTiquete(Tiquete tiquete) {
		
	}
	
	public int calcularValorTotalTiquetes() {
		return 0;
	}
	
	public void usarTiquetes (Vuelo vuelo) {
		
	}
	
}
