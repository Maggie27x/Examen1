package Clases;

import java.util.ArrayList;

public class HistoricoNotas extends Promedio{

    private double total;
    private Promedio promedio;
    private Cursos cursos;
    private double suma;
    private ArrayList<Impresion> notas;
 
    public double getTotal() {
        return total;
        
    }

    public ArrayList<Impresion> getNotas() {
        return notas;
    }



    public void setNotas(ArrayList<Impresion> notas) {
        this.notas = notas;
    }

  public HistoricoNotas(ArrayList<Impresion> notas) {
        this.notas = notas;
        this.total=0;
   

         if (notas != null) {
            for (Impresion impresion : notas) {
                   
                this.total += impresion.getTotal();
            }
            

        }
        

    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = this.cursos.getI();
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
        this.suma=this.cursos.getI();
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

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
  

    public HistoricoNotas(int cantidad) {
        super(cantidad);
        
    }

    public Promedio getPromedio1() {
        return promedio;
    }

    public void setPromedio1(Promedio promedio1) {
        this.promedio = promedio1;
    }

    public HistoricoNotas() {
    }

    public String impresionNotas() {
        String todasLasNotas = "Curso\t\t\t\t\tPeriodo\tNota\tProfesor\n";
       
        if (notas != null) {
            for (Impresion impresion : notas) {
                todasLasNotas += impresion + "\n";

            }
        }
        return todasLasNotas;

    }
    

    @Override
    public String toString() {
        return "" + this.impresionNotas() + "\n" + "\t\t\t\t\t\tPROMEDIO\t" + this.total+suma+'}';
    }

}
