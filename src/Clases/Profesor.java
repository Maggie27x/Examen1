package Clases;

public class Profesor extends Persona {

    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Profesor() {

    }

    public Profesor(String nombre, String apellidos) {
        super(nombre, apellidos);
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Profesor{" + "persona=" +this. persona.getNombre()+ this.persona.getApellidos() + '}';
    }

    

}
