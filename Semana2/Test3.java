package Semana2;

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\racmd\\Documents\\Magia.txt");
            int i = fis.read();
            System.out.println((char)i);
            fis.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}