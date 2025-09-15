package uniandes.dpoo.aerolinea.tiquetes;

import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	
	
	
	
    private final String codigo;
    private final Vuelo vuelo;
    private final Cliente cliente;
    private final int valor;
    private boolean usado;

    public Tiquete(String codigo, Vuelo vuelo, Cliente cliente, int valor) {
    	
    	
    	
        this.codigo = codigo;
        this.vuelo = vuelo;
        this.cliente = cliente;
        this.valor = valor;
        this.usado = false;
    }

    public String getCodigo() { return codigo; }
    public Vuelo getVuelo() { return vuelo; }
    public Cliente getCliente() { return cliente; }
    public int getValor() { return valor; }
    public boolean isUsado() { return usado; }
    public void marcarUsado() { this.usado = true; }

	public Collection<?> getTarifa() {
		// TODO Auto-generated method stub
		return null;
	}
}