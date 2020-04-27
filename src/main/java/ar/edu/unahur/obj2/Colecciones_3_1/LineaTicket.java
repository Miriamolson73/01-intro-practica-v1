package ar.edu.unahur.obj2.Colecciones_3_1;

import javax.swing.*;
import java.util.List;

import static javax.swing.JOptionPane.showMessageDialog;

public class LineaTicket {
    String nombre;
    Double precio;
    int cantidad;
    Double precioTotal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LineaTicket(String nombre, Double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.precioTotal=precio*cantidad;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "LineaTicket (" +
                " nombre = '" + nombre + '\'' +
                ", cantidad = " + cantidad +
                ", precioTotal = " + precioTotal +
                ')';
    }
}
