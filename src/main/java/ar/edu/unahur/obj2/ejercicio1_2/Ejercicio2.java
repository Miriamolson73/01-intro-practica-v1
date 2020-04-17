package ar.edu.unahur.obj2.ejercicio1_2;

import static javax.swing.JOptionPane.*;

public class Ejercicio2 {
    public int[]  ingreso() {
        int[] lista = new int[10];
        int aux=1;

        showMessageDialog(null,"INGRESE UNA LISTA CON 10 NUMEROS");
        for (int i = 0; i <= 9; i++) {
            lista[i] = Integer.parseInt(showInputDialog("DIGITE EL " + aux + " DE LA LISTA:  "));
            aux+=1;
        }
        return lista;
    }
    public int[] buscar(int [] laLista){
        int[] respuesta=new int[10];
        int aux =0;
        int numero;
        numero = Integer.parseInt(showInputDialog("DIGITE NUMERO DE REFERENCIA : "));
        for (int i=0; i<laLista.length; i++){
            if (numero< laLista[i]){
                respuesta[aux]=laLista[i];
                aux+=1;
            }
        }
        return respuesta;
    }
    public void imprimir(int [] solucion){

        System.out.print( " LOS NUMEROS MAYORES SON  : ");

        for (int i=0; i<solucion.length; i++) {
            if (solucion[i] != 0) {
                System.out.print( " , "+solucion[i]);
            }
        }
    }
    public void ejecutar(){
        this.imprimir(this.buscar(this.ingreso()));


    }
}
