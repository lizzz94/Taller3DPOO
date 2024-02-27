package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

abstract class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {
	    // declarar los atributos protegidos
	    protected final int COSTO_POR_KM = 1000;

	        public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
	            return 0;
	        }

	  
	        public double calcularPorcentajeDescuento(Cliente cliente) {
	            double descuento = 0.0;
	            return descuento;
	        }
	
}
