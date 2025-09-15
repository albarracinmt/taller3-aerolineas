package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
    private final String identificador;
    private final List<Tiquete> tiquetes;

    public Cliente(String identificador) {
        this.identificador = identificador;
        this.tiquetes = new ArrayList<>();
    }

    public String getIdentificador() { return identificador; }

    public void agregarTiquete(Tiquete t) {
        if (t != null) tiquetes.add(t);
    }

    public List<Tiquete> getTiquetes() { return tiquetes; }

    public abstract String getTipoCliente();
}
