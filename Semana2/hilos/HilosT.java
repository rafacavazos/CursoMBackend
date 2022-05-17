package Semana2.hilos;


import com.sun.prism.shader.Solid_LinearGradient_PAD_AlphaTest_Loader;
import com.sun.scenario.effect.impl.prism.ps.PPSBlend_MULTIPLYPeer;

import javax.xml.transform.SourceLocator;

public class HilosT extends Thread{
    //Runnable
    public void run(){
        System.out.println("El hilo se esta ejecutando");
    }
    /*
    public void start(){
        //Iniciar la ejecucuón de un hilo
        //la JVM llamar al método run() del hilo

    }

    sleep - Detiene de manera temporal el número especificado
    join() - Espera a que el hilo se muera para entrar
    getPriority - Regresa la prioridad del hilo
    setPriority - Establece la prioridad del hilo
    getName - Nombre del hilo
    currentThread - Referencia al hilo que se esta ejecutando
    getID - Regresa el id del hilo
    Thread.State getState - Regresa el state del hilo
    isAlive - si esta vivo

    */
    public static void main(String[] args) {
        HilosT hilo = new HilosT();
        hilo.start();

    }
}
class HilosR implements Runnable{
    @Override
    public void run() {
        System.out.println("El hilo del runnable esta corriendo");

    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }
}