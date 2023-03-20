
package Clases;


public class LineaHistoricoNotas {
    
    private double nota;
    private Profesor profesor;
    private Periodo periodo;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public LineaHistoricoNotas(double nota, Periodo periodo, Profesor profesor) {
        this.nota = nota;
        this.profesor = profesor;
        this.periodo = periodo;
    }

   

    public LineaHistoricoNotas() {
    }

    @Override
    public String toString() {
        return this.periodo + "\t" + nota + "\t\t" + profesor;
    }
    
    
    
            
    
}
