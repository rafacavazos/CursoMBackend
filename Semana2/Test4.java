package Semana2;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\racmd\\Documents\\Magia.txt");
            int i = 0;
            while ((i = fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
