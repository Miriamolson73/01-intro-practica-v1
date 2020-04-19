package ar.edu.unahur.obj2.ejercicio1_4;

import ar.edu.unahur.obj2.ejercicio1_3.Ejercicio1_3;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Ejercicio1_4Test {

    @Test
    public void testIngreso() {
        Ejercicio1_4 Ejemplo1   = new Ejercicio1_4();
        Ejemplo1.busqueda(Ejemplo1.ingreso());
    }

    @Test
    public void testBusqueda() {
    }
}