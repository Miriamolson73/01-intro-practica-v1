package ar.edu.unahur.obj2.clases.ej2_1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    Scanner entrada = new Scanner(System.in);
    List<Empleado> listaEmpleado = new ArrayList<>();
    int dni;
    String nombre, apellido, email;
    float sueldoBase;
    float porcentajeComision;
    float ventas;
    float horasExtras;
    float horasMes;
    String fun;

    public static void main(String[] args) {
        Main ej = new Main();

        ej.imprimir(ej.ingreso());
    }


    public List<Empleado> ingreso() {
         int cantAIngresar;
        cantAIngresar=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de empleados a ingresar :"));
        for (int i = 0; i < cantAIngresar; i++) {


            System.out.print("Ingrese DNI :");
            dni = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Ingrese Nombre :");
            nombre = entrada.nextLine();
            System.out.print("Ingrese Apellido :");
            apellido = entrada.nextLine();
            System.out.print("Ingrese Email :");
            email = entrada.nextLine();
            System.out.print("Ingrese Sueldo Base :");
            sueldoBase = entrada.nextFloat();
            entrada.nextLine();

            System.out.print("ingrese Funcion: A=Administrativo V= Vendedor :");
            fun = entrada.nextLine();
            if (fun.equals("A") || "a".equals(fun)) {
                System.out.print("Ingrese Horas Extras :");
                horasExtras = entrada.nextFloat();
                System.out.print("Ingrese Horas Mes :");
                horasMes = entrada.nextFloat();
                listaEmpleado.add(i, new Administrativo(dni, nombre, apellido, email, sueldoBase, horasExtras, horasMes));
            }
            else if (fun.equals("V") || "v".equals(fun)) {
                System.out.print("Ingrese porcentaje Comision :");
                porcentajeComision = entrada.nextFloat();
                System.out.print("Ingrese Ventas :");
                ventas = entrada.nextFloat();
                listaEmpleado.add(i, new Vendedor(dni, nombre, apellido, email, sueldoBase, porcentajeComision, ventas));

            }
            else {
                System.out.println("error no es una opcion valida");
            }


        }
        return listaEmpleado;
    }
    public void imprimir(List<Empleado> lista)
    {
        for (Empleado e :lista){
            System.out.println(e);
        }
    }}






