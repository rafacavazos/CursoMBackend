package Semana2;

abstract class hola{
    void saludar(){
        //como lo hace
        System.out.printf("¿Cómo estás?, Te ves bien eh");
    }
    abstract void saludo();
}
interface Mostrar{
    //que hace
    void show();
    abstract void despide();
}


public class SaludosCordiales implements Mostrar{
    @Override
    public void show() {
        System.out.println("Hola, ¿Cómo estás?, espero no del todo mal....");

    }
    @Override
    public void despide() {

    }
    public static void main(String[] args){
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();

    }



}
