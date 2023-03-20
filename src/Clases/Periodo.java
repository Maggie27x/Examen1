
package Clases;


public class Periodo {
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

 

    public Periodo(String descripcion) {
        this.descripcion = descripcion;
      
    }

    public Periodo() {
    }

    @Override
    public String toString() {
        return ""+ descripcion + '}';
    }

   
    
    
    
}
