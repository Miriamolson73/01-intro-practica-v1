package ar.edu.unahur.obj2.ejercicio1_4;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Ejercicio1_4 {
   /* Pide al usuario los nombres y apellidos de todos tus compañeros de clase y almacénalos en un array.

    Después pídele usuario una letra y muestra aquellos alumnos cuyo nombre empiece por dicha letra.

        Nota: El programa termina cuando se escriba FIN como búsqueda.*/

   public String[] ingreso() {
       int cantidad;
       cantidad=Integer.parseInt(showInputDialog("INGRESE TOTAL DE PERSONAS A INGRESAR "));
       String [] nombre=new String[cantidad];
       showMessageDialog(null, "INGRESE NOMBRE Y APELLIDO) ");
       for (int i = 0; i <cantidad; i++) {
           nombre[i]=showInputDialog("Nro "+(i+1)+" INGRESE NOMBRE :  ");
       }
       return nombre;
   }

    public void busqueda(String[] nombres){
        String letra;
        int contador;
        letra=(showInputDialog("INGRESE LA LETRA A BUSCAR, FIN para terminar "));
        while (! letra.equals("FIN")) {
            contador = 0;
            for (int i = 0; i <nombres.length; i++) {
                 if (nombres[i].startsWith(letra)) {
                    System.out.println("CONTIENE " + letra + " " + nombres[i]);
                    contador++;
                  }
            }
            if (contador == 0) {
                    System.out.println("NO SE ENCOTRARON COINCIDENCIAS CON ESA LETRA");
            }
            letra=(showInputDialog("INGRESE LA LETRA A BUSCAR, FIN para terminar "));
        }
        System.out.println("FIN DE  BUSQUEDA");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}


