package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Ruta;

public abstract class CalculadoraTarifas {
	public final double impuesto = 0.28;

	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		return 0;
	}
	
	protected int calcularVaorImpuesto(int costoBase) {
		return 0;
	}

	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	protected abstract double calcularPorcentajeDescuento(Cliente cliente); 

}