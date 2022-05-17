package Semana2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test5 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\racmd\\Documents\\Magia.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);
            String s = "Hola viajeros de \n Innovación Virtual";
            byte[]b= s.getBytes(StandardCharsets.UTF_8);
            bout.write(b);
            bout.flush();
            bout.close();
            fos.close();
            System.out.println("Ready");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

    }
}
