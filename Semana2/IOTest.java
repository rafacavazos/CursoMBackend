package Semana2;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\racmd\\hola.txt");
            fos.write(65);
            fos.close();
        }catch(IOException ioe){
            System.out.println(ioe);

        }
    }
}
