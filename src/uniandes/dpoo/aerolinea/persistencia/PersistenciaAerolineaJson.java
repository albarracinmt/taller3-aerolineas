package uniandes.dpoo.aerolinea.persistencia;

import uniandes.dpoo.aerolinea.modelo.Aerolinea;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import uniandes.dpoo.aerolinea.modelo.Aerolinea;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class PersistenciaAerolineaJson implements IPersistenciaAerolinea {

    @Override
    public void salvarAerolinea(String archivo, Aerolinea aerolinea) {
        try {
            JSONObject json = new JSONObject();
            JSONArray vuelosJson = new JSONArray();

            for (Vuelo v : aerolinea.getVuelos()) {
                JSONObject vueloJson = new JSONObject();
                vueloJson.put("fecha", v.getFecha());
                vueloJson.put("ruta", v.getRuta().getCodigoRuta());
                vueloJson.put("avion", v.getAvion().getNombre());
                vuelosJson.put(vueloJson);
            }

            json.put("vuelos", vuelosJson);

            try (FileWriter writer = new FileWriter(archivo)) {
                writer.write(json.toString(4));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cargarAerolinea(String archivo, Aerolinea aerolinea) {
        try (FileReader reader = new FileReader(archivo)) {
            JSONTokener tokener = new JSONTokener(reader);
            JSONObject json = new JSONObject(tokener);

            JSONArray vuelosJson = json.getJSONArray("vuelos");

            for (int i = 0; i < vuelosJson.length(); i++) {
                JSONObject vueloJson = vuelosJson.getJSONObject(i);
                String fecha = vueloJson.getString("fecha");
                String ruta = vueloJson.getString("ruta");
                String avion = vueloJson.getString("avion");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}