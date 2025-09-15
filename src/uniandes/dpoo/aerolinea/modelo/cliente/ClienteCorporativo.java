package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

public class ClienteCorporativo extends Cliente {
    public static final String CORPORATIVO = "CORPORATIVO";

    private String nombreEmpresa;
    private int tamanoEmpresa;
    
    
    

    public ClienteCorporativo(String identificador, String nombreEmpresa, int tamanoEmpresa) {
        super(identificador);
        this.nombreEmpresa = nombreEmpresa;
        
        
        
        	
        this.tamanoEmpresa = tamanoEmpresa;
    }

    public static ClienteCorporativo cargarDesdeJSON(JSONObject cliente) {
        String identificador = cliente.getString("id");
        String nombreEmpresa = cliente.getString("nombreEmpresa");
        int tam = cliente.getInt("tamanoEmpresa");
        return new ClienteCorporativo(identificador, nombreEmpresa, tam);
    }

    public JSONObject salvarEnJSON() {
        JSONObject jobject = new JSONObject();
        jobject.put("id", this.getIdentificador());
        jobject.put("nombreEmpresa", this.nombreEmpresa);
        jobject.put("tamanoEmpresa", this.tamanoEmpresa);
        jobject.put("tipo", CORPORATIVO);
        return jobject;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public int getTamanoEmpresa() {
        return tamanoEmpresa;
    }

    @Override
    public String getTipoCliente() {
        return CORPORATIVO;
    }
}
