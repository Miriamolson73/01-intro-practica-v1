package ar.edu.unahur.obj2.ejercicio1_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class Ejercicio1_3Test {
    Ejercicio1_3 Ejemplo1   = new Ejercicio1_3();




    @Test
    public void testEstrella() {
        Ejemplo1.estrella(11.2f);
    }

    @Test
    public void testIngreso() {
        Ejemplo1.ingreso();
    }

    @Test
    public void testImprimir() {
        float [] prueba=new float[24];
        prueba [0]=10.2f;
        prueba[1]=15.3f;
        prueba[2]=20.4f;
        Ejemplo1.impresion( prueba);
    }
}