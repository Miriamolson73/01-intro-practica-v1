package ar.edu.unahur.obj2.Ejercicio1_5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Ejercicio1_5Test {
    Ejercicio1_5 ej=new Ejercicio1_5();
//    @Test
//    public void testContarLetras() {
//        ej.contarLetras();
//    }

    @Test
    public void testVisualizarRecuento() {
        ej.visualizarRecuento(ej.contarLetras());
    }
}