package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;

public abstract class CalculadoraTarifas {
    public abstract int calcularTarifa(Ruta ruta, String fecha);
}

