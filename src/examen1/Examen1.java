
package examen1;

import Clases.*;
import java.util.ArrayList;
import java.util.Calendar;


public class Examen1 {
   
    
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante ("Barry", "Allen", "A32123", "Ingenieria en Sistemas", "Central City, Avenida Central");
        ProfesorGuia profesor = new ProfesorGuia ("Bruce", "Wayne", "Gotham City, Av Central", "Senior");
        Universidad universidad = new Universidad ("Universidad Americana", "Sede Heredia", Calendar.getInstance());
        
        Periodo periodo1 = new Periodo("2021-1");
        Periodo periodo2 = new Periodo("2021-1");
        Periodo periodo3 = new Periodo("2021-2");
        Periodo periodo4 = new Periodo("2021-2");
        Periodo periodo5 = new Periodo("2021-2");
        Periodo periodo6 = new Periodo("2021-3");
        Periodo periodo7 = new Periodo("2021-3");
        Periodo periodo8 = new Periodo("2021-3");
        
        Profesor profesor1 = new Profesor("Bruce", "Wayne");
        Profesor profesor2 = new Profesor("Walter", "Molina");
        Profesor profesor3 = new Profesor("Bruce", "Wayne");
        Profesor profesor4 = new Profesor("Diana", "Pince");
        Profesor profesor5 = new Profesor("Walter", "Molina");
        Profesor profesor6 = new Profesor("Bruce", "Wayne");
        Profesor profesor7 = new Profesor("Walter", "Molina");
        Profesor profesor8 = new Profesor("Diana", "Prince");
        
 
        Cursos curso1 = new Cursos("Programacion I             " , periodo1 , "90", profesor1);
        Cursos curso2 = new Cursos("Organizacion de Estructuras", periodo2 , "89", profesor2);
        Cursos curso3 = new Cursos("Matematica I               ",periodo3, "90", profesor3);
        Cursos curso4 = new Cursos("Etica Profesional          ", periodo4, "88", profesor4);
        Cursos curso5 = new Cursos("Teoria de Sistemas         ", periodo5, "87", profesor5);
        Cursos curso6 = new Cursos("Utilizacion del Software   ", periodo6, "CURSANDO", profesor6);
        Cursos curso7 = new Cursos("Programacion II            ", periodo7, "CURSANDO", profesor7);
        Cursos curso8 = new Cursos("Finanzas 1                 ", periodo8, "CURSANDO", profesor8);
        Promedio promedio1 = new Promedio (5);
       
       ArrayList<Impresion> notas = new ArrayList<>();
       notas.add(new Impresion(curso1));
       notas.add(new Impresion(curso2));
       notas.add(new Impresion(curso3));
       notas.add(new Impresion(curso4));
       notas.add(new Impresion(curso5));
       notas.add(new Impresion(curso6));
       notas.add(new Impresion(curso7));
       notas.add(new Impresion(curso8));
       HistoricoNotas lista = new HistoricoNotas(notas);  
       
        System.out.println(universidad);
        System.out.println(estudiante);
        System.out.println(lista);
        System.out.println(profesor);
        
 
        
    
        
    }
    
}
