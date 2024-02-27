package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
//TODO QUE ES TIQUETESSINUSAR Y TIQUETESUSADOS?????
public class Tiquete {
    private String codigo;
    private Vuelo vuelo;
    private Cliente cliente;
    private int tarifa;
    private boolean usado;
    
    public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
        this.codigo = codigo;
        this.vuelo = vuelo;
        this.cliente = clienteComprador;
        this.tarifa = tarifa;
    }
    
    public Cliente getCliente() {
    	return cliente;
    }
    
    public Vuelo getVuelo() {
    	return vuelo;
    }
    
    public String getCodigo() {
    	return codigo;
    }
    
    public int getTarifa() {
    	return tarifa;
    }
    
    public void marcarComoUsado() {
    	this.usado = true;
    }
    
    public boolean esUsado() {
    	return usado;
    }
}
