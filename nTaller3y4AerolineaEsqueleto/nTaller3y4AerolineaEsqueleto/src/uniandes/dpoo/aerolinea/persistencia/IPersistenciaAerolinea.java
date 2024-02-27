package uniandes.dpoo.aerolinea.persistencia;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public interface IPersistenciaAerolinea {
	
	// Clase que implementa la interfaz IPersistenciaAerolinea
	class PersistenciaAerolineaJson implements IPersistenciaAerolinea {
	    // Implementación del método cargarAerolinea
	    public void cargarAerolinea (String archivo, Aerolinea aerolinea) {
	        // Código para leer el archivo JSON y cargar la información de la aerolínea
	    }

	    // Implementación del método salvarAerolinea
	    public void salvarAerolinea (String archivo, Aerolinea aerolinea) {
	        // Código para escribir el archivo JSON y guardar la información de la aerolínea
	    }

	}
}

