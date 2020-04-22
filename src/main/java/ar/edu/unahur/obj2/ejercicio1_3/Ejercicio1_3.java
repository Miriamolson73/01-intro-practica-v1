package ar.edu.unahur.obj2.ejercicio1_3;

import static javax.swing.JOptionPane.*;

public class Ejercicio1_3 {
    float sumaTemperatura=0;
    float promedio=0;
    float valorMaximo=0.0f;
    float valorMinimo=100.0f;
    public static void main(String[] args){
        Ejercicio1_3 prac=new Ejercicio1_3();
        prac.impresion(prac.ingreso());
    }

    public void ejecutar() {

        this.impresion(this.ingreso());
    }


    ///Usando los datos contenidos en el array, calcula la temperatura media, la máxima y la mínima.
    // Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) y almacénalas en un array.
    public float[] ingreso() {
        float[] temperatura = new  float[24];



        showMessageDialog(null, "INGRESE LA TEMPERATURA DE LA HORA INDICADA ");
        for (int i = 0; i <= 23; i++) {

            temperatura[i] = Float.parseFloat(showInputDialog("INGRESE LA TEMPERATURA A LA HORA: " + i));
            sumaTemperatura+=temperatura[i];
            valorMaximo=this.maximo(temperatura[i],valorMaximo);
            valorMinimo=this.minimo(temperatura[i],valorMinimo);

        }
        promedio=sumaTemperatura/24;
        return temperatura;
    }
    //calcula la cantidad de estrellas y las imprime, recibe la temperatura
    public void estrella(float temp){
        String estrella="*";
        int temp1=(int)temp;
        for (int i =1;i<=temp1;i++){
            System.out.print(estrella);
        }

     }
     //obtiene el maximo
     public Float maximo(float numero1, float numero2){
        float maximo=numero2;
        if (numero1>maximo){
            maximo=numero1;
        }

         return maximo;
    }
    //obtiene el minimo recibe temperatura
    public Float minimo(float numero1,float numero2){
        float minimo=numero2;
        if (numero1<numero2){
            minimo=numero1;
        }

        return minimo;
    }
    ///Visualiza la información en forma de gráfico de barras. Por ejemplo:///
    public void impresion(float[] temp){

        for (int i=0;i<=23;i++) {
            System.out.print(i+"  ");
            this.estrella(temp[i]);
            if (temp[i] == valorMaximo) {
                System.out.println(" "+temp[i] + "  -->  MAX");
            } else if (temp[i] == valorMinimo) {
                System.out.println(" "+temp[i] + "  -->  MIN");
            } else {
                System.out.println(" "+temp[i]);
            }
        }
        System.out.println("Media: "+promedio);

    }


    public float getSumaTemperatura() {
        return sumaTemperatura;
    }

    public void setSumaTemperatura(float sumaTemperatura) {
        this.sumaTemperatura = this.sumaTemperatura +sumaTemperatura;
    }





}



