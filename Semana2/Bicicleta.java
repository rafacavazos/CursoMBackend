package Semana2;

import javax.xml.transform.SourceLocator;

abstract class Mountain{
    Mountain(){
        System.out.println("Se ha creado una bicicleta de montaña");
    }
    abstract void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("Cambiando color a rojo");
    }
}
class Magistroni extends Mountain{
    void cambiarVelocidad(){
        System.out.println("Se deben mdificar las perillas del manubrio primero");
    }
}
public class Bicicleta {
    void cambiarVelocidad(){
        System.out.println("gira la perilla");
    }
    public static void main (String[] args){
        Mountain bici1 = new Magistroni();
        bici1.cambiarVelocidad();
        bici1.cambiarColor();
    }
}
