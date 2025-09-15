package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

public class ClienteNatural extends Cliente {
    public static final String NATURAL = "NATURAL";

    private String nombre;
    private String cedula;

    public ClienteNatural(String identificador, String nombre, String cedula) {
        super(identificador);
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public static ClienteNatural cargarDesdeJSON(JSONObject j) {
        String id = j.getString("id");
        String nombre = j.getString("nombre");
        String cedula = j.getString("cedula");
        return new ClienteNatural(id, nombre, cedula);
    }

    public JSONObject salvarEnJSON() {
        JSONObject o = new JSONObject();
        o.put("id", getIdentificador());
        o.put("nombre", nombre);
        o.put("cedula", cedula);
        o.put("tipo", NATURAL);
        return o;
    }

    @Override
    public String getTipoCliente() { return NATURAL; }

    public String getNombre() { return nombre; }
    public String getCedula() { return cedula; }
}