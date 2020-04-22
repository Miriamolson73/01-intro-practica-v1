package ar.edu.unahur.obj2.ejercicio1_2;

import org.testng.annotations.Test;

public class Ejercicio2Test {

    @Test
    public void testEjecutar() {
        Ejercicio2 dos = new Ejercicio2();
        int[] eje={10,9,8};
        dos.buscar(eje);
     //   dos.ejecutar();
        dos.imprimir(dos.ingreso());
    }
}