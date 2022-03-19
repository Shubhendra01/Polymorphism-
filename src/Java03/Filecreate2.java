package Java03;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Filecreate2 {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('A',0);
        map.put('E',0);
        map.put('I',0);
        map.put('O',0);
        map.put('U',0);
        try {
            FileInputStream file = new FileInputStream("data.txt");

            String data = "";
            int i = 0;

            while ((i = file.read()) != -1) {
//                System.out.println((char) i);

                if ((char) i == 'A'){

                    map.put('A',map.get('A')+1) ;

                }

                if ((char) i == 'E'){

                    map.put('E',map.get('E')+1) ;

                }

                if ((char) i == 'I'){

                    map.put('I',map.get('I')+1) ;

                }

                if ((char) i == 'O'){

                    map.put('O',map.get('O')+1) ;

                }

                if ((char) i == 'U'){

                    map.put('U',map.get('U')+1) ;

                }




            }

            System.out.println("Count of A is "+map.get('A'));
            System.out.println("Count of E is "+map.get('E'));
            System.out.println("Count of I is "+map.get('I'));
            System.out.println("Count of O is "+map.get('O'));
            System.out.println("Count of U is "+map.get('U'));


        }
        catch(FileNotFoundException e){

            e.printStackTrace();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}


