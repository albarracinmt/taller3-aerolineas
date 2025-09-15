package uniandes.dpoo.aerolinea.modelo;



import java.util.ArrayList;
import java.util.List;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;


public class Vuelo {

	 private String fecha;
	    private Ruta ruta;
	    private Avion avion;
	    private List<Tiquete> tiquetes;

	    public Vuelo(String fecha, Ruta ruta, Avion avion) {
	        this.fecha = fecha;
	        this.ruta = ruta;
	        this.avion = avion;
	        this.tiquetes = new ArrayList<>();
	    }

	    public String getFecha() {
	        return fecha;
	    }

	    public Ruta getRuta() {
	        return ruta;
	    }

	    public Avion getAvion() {
	        return avion;
	    }

	    public List<Tiquete> getTiquetes() {
	        return tiquetes;
	    }

	    public void agregarTiquete(Tiquete tiquete) {
	        this.tiquetes.add(tiquete);
	    }
	    
	    private boolean realizado = false;

	    public boolean hayCupo(int cantidad) {
	        return tiquetes.size() + cantidad <= avion.getCapacidad(); 
	    }

	    public void ocuparUnaSilla() {
	        if (!hayCupo(1)) throw new IllegalStateException("No hay cupo");
	    }

	    public void marcarRealizado() {
	        realizado = true;
	    }

	    public boolean isRealizado() {
	        return realizado;
	        
	        
	    }
}
