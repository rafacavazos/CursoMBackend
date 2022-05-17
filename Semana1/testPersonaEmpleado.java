package semana1;

public class testPersonaEmpleado {
    public static void main(String[] args){
        Empleado e1 = new Empleado(1,"Rafael",15.5);
        e1.display();

        Programadora fer = new Programadora();
        System.out.println("El salario de la programadora es: " +
                fer.salario);
        System.out.println("El bono de la programadora es " +
                fer.bono);
    }
}
