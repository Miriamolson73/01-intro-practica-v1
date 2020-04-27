package ar.edu.unahur.obj2.Colecciones_3_1;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static javax.swing.JOptionPane.showMessageDialog;

public class Ticket {
     List <LineaTicket> venta=new ArrayList<>();




    public List<LineaTicket> ingresoDeVenta() {
        int indice = 0;

        showMessageDialog(null, "carga de Tickets /n terminar");
        LineaTicket carga = cargaDatos();
        while (! (carga.getNombre().equals("n"))) {
            venta.add(carga);
            indice++;
            carga = cargaDatos();
        }
        return venta;
    }


    public LineaTicket cargaDatos(){
        String nombre;
        double precio;
        int cantidad;
        nombre= JOptionPane.showInputDialog("ingrese el nombre del articulo /n termina la carga ");
        if (!nombre.equals("n")) {
            precio = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio "));
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad "));
        }
        else {precio=0.00;cantidad=0;}

        return new LineaTicket(nombre,precio,cantidad);
    }
    public void impresion(List<LineaTicket> venta){
        Double importeTotal=0.00;
        for(LineaTicket p:venta){
            importeTotal+=p.getPrecioTotal();
            System.out.println(p);
        }
        System.out.println("LineaTicket               Importe Total Ticket :   $  "+importeTotal);
    }



}
