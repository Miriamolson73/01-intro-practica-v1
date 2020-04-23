package ar.edu.unahur.obj2.clases.ej2_1;

public class Empleado {
    public  int dni;
    public  String nombre,apellido;
    public String email;

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public float sueldoBase;

    public Empleado(int dni, String nombre, String apellido, String email, float sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sueldoBase=" + sueldoBase +
                '}';
    }
}
