package ar.edu.unahur.obj2.clases.ej2_1;

public class Vendedor extends Empleado {
    public Vendedor(int dni, String nombre, String apellido, String email, float sueldoBase) {
        super(dni, nombre, apellido, email, sueldoBase);
    }

    public Vendedor(int dni, String nombre, String apellido, String email, float sueldoBase, float porcentajeComision, float ventas) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.porcentajeComision = porcentajeComision;
        this.ventas = ventas;
        this.sueldoBase=sueldoBase+(porcentajeComision*ventas/100);
    }

    float porcentajeComision;
    float ventas;
    //Si es vendedor: sueldoBase + (porcenComision*totalVtas/100)

   /* @Override
    public float getSueldoBase() {
        float  cuenta;
        cuenta=super.getSueldoBase()+(porcentajeComision*ventas/100);
        return cuenta;

    }*/

    @Override
    public void setSueldoBase(float sueldoBase) {
        super.setSueldoBase(sueldoBase);
    }
}
