
package Clases;

import java.util.Calendar;


public class Universidad {
    private String nombreUniversidad;
    private String sede;
    private Calendar fecha;

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    
    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Universidad(String nombreUniversidad, String sede, Calendar fecha) {
        this.nombreUniversidad = nombreUniversidad;
        this.sede = sede;
        this.fecha = fecha;
    }
    
    

    public Universidad() {
    }

    @Override
    public String toString() {
        return this.nombreUniversidad + "\t\t\t\t\t\t" + "Historico de Notas" + "\n" 
             + this.sede + "\t\t\t\t\t\t\t" + this.fecha.getTime() + "\n\n\n" ; 
                
    }

    
    
    
}
