package semana1;

public class Empleado extends Persona{
    double salario;
    Empleado(){
    }
    Empleado(int id, String nombre, double salario){
        super(id, nombre);
        this.salario = salario;
    }
    void display(){
        System.out.println(id + "" + nombre + ""+ salario);
    }
}