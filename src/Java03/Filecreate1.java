package Java03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecreate1 {
    public static void main(String[] args) {
        String data="HAPPY NEW YEAR";
        try{
            FileOutputStream file=new FileOutputStream("data.txt");
            byte b[]=data.getBytes();
            file.write(b);
            file.close();
            System.out.println("File created Successfully");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}


