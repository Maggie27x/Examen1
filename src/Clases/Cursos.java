package Clases;

public class Cursos {

    private String descripcion;
    private Periodo periodo;
    private Profesor profesor;
    public String nota;
    public int nota2;
     public int i;
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public int getI() {
        return i;
    }

   

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

   
    public Cursos() {
    }

    public Cursos(String descripcion, Periodo periodo, String nota, Profesor profesor) {
        this.descripcion = descripcion;
        this.periodo = periodo;
        this.profesor = profesor;
        this.nota = nota;
         
        if (nota == "Cursando") {
            this.nota = nota;
            
   this.i=5;

        } else {
            if (nota == "CURSANDO") {
                this.nota = nota;
               
      this.i=5;
            } else {
                if (nota == "cursando") {
                    this.nota = nota;
                } else {

                    int cadenanum = Integer.parseInt(this.nota);
                    nota2 = cadenanum;

                }
            }
        }
    }
    

    @Override
    public String toString() {
        if (nota == "Cursando") {
            return descripcion + "\t\t" + periodo + "\t " + nota + "\t" + profesor.getNombre() + "\t" + profesor.getApellidos()+ '}';
            
        } else {
            if (nota == "CURSANDO") {
                return descripcion + "\t\t" + periodo + "\t " + nota + "\t" + profesor.getNombre() +"\t" +profesor.getApellidos()+ '}';
            } else {
                if (nota == "cursando") {
                    return descripcion + "\t\t" + periodo + "\t " + nota + "\t" + profesor.getNombre() +"\t" +profesor.getApellidos()+ '}';
                }
            }
        }

        return descripcion + "\t\t" + periodo + "\t " + nota2 + "\t" + profesor.getNombre() +"\t" + profesor.getApellidos()+'}';
    }

}
