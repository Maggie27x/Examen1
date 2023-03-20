/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import Clases.Promedio;
import examen1.Examen1;
/**
 *
 * @author marti
 */
public class Impresion extends Examen1 {

    private double promedio;
    private Cursos cursos;
    private double total;
    private Promedio promedio1;

    public double getPromedio() {
        return promedio;
    }

    public Promedio getPromedio1() {
        return promedio1;
    }

    public void setPromedio1(Promedio promedio1) {
        this.promedio1 = promedio1;
    }



   

    public void setPromedio(double promedio) {
        this.promedio = promedio;
         if(this.cursos!= null)
            this.total =(this.cursos.getNota2()+ this.cursos.getNota2());
    }
    public double getTotal() {
        return total;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
        if (promedio > 0)
            this.total =(this.cursos.getNota2()+ this.cursos.getNota2());
    }
   

    public Impresion() {
    }
 
 
    public Impresion(Cursos cursos) {
        this.cursos = cursos;
        
       this.total = this.cursos.getNota2()/this.cursos.getI();
    }

    @Override
    public String toString() {
        return "\n" + this.cursos + '}';
    }

}
