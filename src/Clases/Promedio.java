/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
/**
 *
 * @author marti
 */
public class Promedio extends Cursos {
  public int cantidad;

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Promedio(int cantidad) {
        this.cantidad = cantidad;
    }

    public Promedio() {
    }

    @Override
    public String toString() {
        return "Promedio{" + "cantidad=" + cantidad + '}';
    }
  
 
   
}
