package ar.edu.unahur.obj2.Ejercicio1_6;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;


public class Ej_1_6 {
    int [][] matriz=new int [3][3];

    public int[][] ingressoValores() {
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                 matriz[i][j] = Integer.parseInt(showInputDialog("INGRESE VALOR EN UBICACION " + i + "," + j + ":"));
                    //cantidad=Integer.parseInt(showInputDialog("INGRESE TOTAL DE PERSONAS A INGRESAR "));
                }
            }

        return matriz;
    }

    public void imprimir(int [][] matriz) {
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "|");
            }

            System.out.println();
        }
    }
     public static void main (String[] args){
            Ej_1_6 pr = new Ej_1_6();
            pr.imprimir(pr.ingressoValores());
      }

    }