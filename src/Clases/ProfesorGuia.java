
package Clases;


public class ProfesorGuia extends Persona {
     private String NivelProfesor;
    private String direccionProfesor;

    public String getNivelProfesor() {
        return NivelProfesor;
    }

    public void setNivelProfesor(String NivelProfesor) {
        this.NivelProfesor = NivelProfesor;
    }

    public String getDireccionProfesor() {
        return direccionProfesor;
    }

    public void setDireccionProfesor(String direccionProfesor) {
        this.direccionProfesor = direccionProfesor;
    }

    public ProfesorGuia() {
    }

    public ProfesorGuia(String nombre, String apellidos, String direccionProfesor, String NivelProfesor) {
        super(nombre, apellidos);
        this.NivelProfesor = NivelProfesor;
        this.direccionProfesor = direccionProfesor;
    }

    @Override
    public String toString() {
        return "\nDatos del Profesor Guia del Estudiante" + "\n" + super.getNombre() + " " + super.getApellidos()
                + "\nDireccion: " + this.getDireccionProfesor() + "\n" + "Nivel Profesor: " + this.getNivelProfesor();
    }
    
}
