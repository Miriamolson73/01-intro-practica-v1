package ar.edu.unahur.obj2.ejercicio2;

import ar.edu.unahur.obj2.ejercicio1.Ejercicio2;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Ejercicio2Test {

    @Test
    public void testEjecutar() {
        Ejercicio2 dos = new Ejercicio2();
       // dos.buscar({10;9;8});
        dos.ejecutar();
       // dos.imprimir(dos.ingreso());
    }
}