
package Clases;


public class Estudiante extends Persona{
    
     private String carne;
    private String carrera;
    private String direccionEstudiante;

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDireccionEstudiante() {
        return direccionEstudiante;
    }

    public void setDireccionEstudiante(String direccionEstudiante) {
        this.direccionEstudiante = direccionEstudiante;
    }

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, String carne, String carrera, String direccionEstudiante) {
        super(nombre, apellidos);
        this.carne = carne;
        this.carrera = carrera;
        this.direccionEstudiante = direccionEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante: " + super.getNombre() + " " + super.getApellidos()
                + "\nCarné: " + this.getCarne() + "\nCarrera: " + this.getCarrera()
                + "\nDireccion: " + this.getDireccionEstudiante();
    }
}
