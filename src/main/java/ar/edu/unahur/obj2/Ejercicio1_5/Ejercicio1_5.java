package ar.edu.unahur.obj2.Ejercicio1_5;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Ejercicio1_5 {
    /*Realizar un programa que cuente el número de veces que aparece
    cada una de las letras del alfabeto en un texto introducido por el usuario.

    El recuento se hará mediante la función contarLetras() y se
     almacenará el total de cada letra en la posición correspondiente de un array.

    Después se mostrará el resultado en pantalla mediante la función visualizarRecuento().

    Nota: Recordad que para acceder a los caracteres individuales de un String disponemos del método .charAt().*/
    public static void main(String[]args){
        Ejercicio1_5 p=new Ejercicio1_5();
        p.visualizarRecuento(p.contarLetras());
    }
    public List contarLetras() {
        List<String> coincidecias=new ArrayList<>();
        int cantidad;
        int mayuscula=65;
        int minuscula=65+32;
        int asciLetra;
        String letra=" ";

        String nombre = showInputDialog("INGRESE PALABRA ");
        while (minuscula<=122) {
            cantidad=0;
            for (int i = 0; i < nombre.length(); i++) {
                asciLetra = nombre.charAt(i);
                if (asciLetra == mayuscula || asciLetra == minuscula) {
                    cantidad++;
                    letra= String.valueOf(nombre.charAt(i));
                }
            }
             if (cantidad > 0) {
                   coincidecias.add(letra + " = " + cantidad+"");
              }
            minuscula += 1;
            mayuscula += 1;
         }

        return coincidecias;
    }

    public void visualizarRecuento(List lista){

        System.out.println(lista);
    }

    }







