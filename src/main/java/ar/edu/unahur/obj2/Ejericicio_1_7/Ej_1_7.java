package ar.edu.unahur.obj2.Ejericicio_1_7;

import java.util.Random;

import static java.lang.Integer.*;


public class Ej_1_7 {
    public int[][] matriz = new int[10][10];

    public int[][] carga() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Random r = new Random();
                int aleatorio = r.nextInt(100);

                matriz[i][j] = aleatorio;
            }

        }
    return matriz;
    }
    public void impresion(int [][] matriz2){
        for (int i = 0; i < 10; i++) {
            System.out.print("|");
            for (int j = 0; j < 10; j++) {
                System.out.format("%02d%s",matriz[i][j],"|" );
            }

            System.out.println();
        }
    }
    public static void main(String[]args){
        Ej_1_7 ejemplo=new Ej_1_7();
        ejemplo.impresion(ejemplo.carga());
    }
}
