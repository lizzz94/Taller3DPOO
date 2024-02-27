 package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{
	private String nombreEmpresa;
	private int tamanoEmpresa;
	//Esta parte es confusa pues al no estar subrayado el atributo en el diagrama
	//pero al mismo tiempo asignarle un valor, no queda claro si es public static final o public final
	public static final String CORPORATIVO = "Coporativo";
	public final int GRANDE = 1;
	public final int MEDIANA = 2;
	public final int PEQUENA = 3;
	
	public ClienteCorporativo(String nombreEmpresa, int tamano) {
		nombreEmpresa = this.nombreEmpresa;
		tamano = this.tamanoEmpresa;
	}
    
    public String getNombreEmpresa() {
    	return nombreEmpresa;
    }
    
    public int getTamanoEmpresa() {
		int tamano = 0;
		if(this.tamanoEmpresa == GRANDE) {
			tamano = GRANDE;
		}
		if(this.tamanoEmpresa == MEDIANA) {
			tamano = MEDIANA;
		}
		if(this.tamanoEmpresa == PEQUENA) {
			tamano = PEQUENA;
		}
		return tamano;
	}
    
    public String getTipoCliente() {
    	return "ayuda";
    }
    
    public String getIdentificador() {
    	return "ayuda";
    }

    /**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo( nombreEmpresa, tam );
    }

    /**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", CORPORATIVO );
        return jobject;
    }
}
