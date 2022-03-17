package Java03;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) {

        try{
            FileInputStream file=new FileInputStream("Sample.txt");
            int j=0;
            while((j=file.read())!=-1)
            {
                System.out.println( (char)j );
            }
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();

        }
    }
}
