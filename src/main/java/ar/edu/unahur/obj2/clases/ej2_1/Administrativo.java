package ar.edu.unahur.obj2.clases.ej2_1;

public class Administrativo extends Empleado {
    public Administrativo(int dni, String nombre, String apellido, String email, float sueldoBase) {
        super(dni, nombre, apellido, email, sueldoBase);
    }
    float horasExtras;
    float horasMes;

    public Administrativo(int dni, String nombre, String apellido, String email, float sueldoBase, float horasExtras, float horasMes) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.horasExtras = horasExtras;
        this.horasMes = horasMes;
        this.sueldoBase= (float) (sueldoBase*(horasExtras*1.5+horasMes)/horasMes);
    }
//    Si es administrativo: sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes



}
