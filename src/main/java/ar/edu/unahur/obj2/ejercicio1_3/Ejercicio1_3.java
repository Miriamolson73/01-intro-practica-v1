package ar.edu.unahur.obj2.ejercicio1_3;

import static javax.swing.JOptionPane.*;

public class Ejercicio1_3 {
    float sumaTemperatura=0;
    float promedio=this.getSumaTemperatura()/24;
    float valorMaximo=0.0f;
    float valorMinimo=100.0f;



    ///Usando los datos contenidos en el array, calcula la temperatura media, la máxima y la mínima.



    // Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) y almacénalas en un array.
    public float[] ingreso() {
        float[] temperatura = new  float[24];



        showMessageDialog(null, "INGRESE LA TEMPERATURA DE LA HORA INDICADA ");
        for (int i = 0; i <= 23; i++) {

            temperatura[i] = Float.parseFloat(showInputDialog("INGRESE LA TEMPERATURA A LA HORA: " + i));
            this.setSumaTemperatura(temperatura[i]);
            this.setValorMaximo(this.maximo(temperatura[i],this.getValorMaximo()));
            this.setValorMinimo(this.minimo(temperatura[i],this.getValorMinimo()));
        }
       // promedio=sumaTemperatura/24;
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
        float maximo;
        if (numero1==numero2){
            maximo=numero1;
        }
        else if (numero1>numero2){
            maximo=numero1;
        }
        else{
            maximo=numero2;
        }
        return maximo;
    }
    //obtiene el minimo recibe temperatura
    public Float minimo(float numero1,float numero2){
        float minimo;
        if (numero1==numero2){
            minimo=numero1;
        }
        else if (numero1>numero2){
            minimo=numero2;
        }
        else{
            minimo=numero1;
        }
        return minimo;
    }
    ///Visualiza la información en forma de gráfico de barras. Por ejemplo:///
    public void impresion(float temperatura[], float valorMinimo,float valorMaximo){
        float [] temp=new float[temperatura.length];
        temp=temperatura;
        for (int i=0;i<=23;i++) {
            System.out.print(i+"  ");
            this.estrella(temp[i]);
            if (temp[i] == valorMaximo) {
                System.out.println(temp[i] + "  -->  MAX");
            } else if (temp[i] == valorMinimo) {
                System.out.println(temp[i] + "  -->  MIN");
            } else {
                System.out.println(temp[i]);
            }
        }

    }
    public void ejecutar(){
        //this.ingreso();
        this.impresion(this.ingreso(),getValorMinimo(),getValorMaximo());
    }

    public float getSumaTemperatura() {
        return sumaTemperatura;
    }

    public void setSumaTemperatura(float sumaTemperatura) {
        this.sumaTemperatura = this.sumaTemperatura +sumaTemperatura;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public float getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(float valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public float getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(float valorMinimo) {
        this.valorMinimo = valorMinimo;
    }
}



