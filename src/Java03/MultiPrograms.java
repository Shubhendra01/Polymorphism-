package Java03;
import java.util.Scanner;
class divby8 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("The numbers which are divisible by 8 is:");
            for (int i = 1; i <= 100; i++) {
                if (i % 8 == 0) {
                    System.out.print(i+",");
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class EvenAndOdd extends Thread {
    int a;
    public EvenAndOdd(int a){
        this.a = a;
    }

    @Override
    public void run() {
        try {
            if(a%2==0)
                System.out.println(a+" Is a even number.");
            else
                System.out.println(a+" Is a odd number.");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Five extends Thread{
    int b;

    public Five(int b){
        this.b = b;
    }

    @Override
    public void run() {
        try{
            if(b%5==0)
                System.out.println(b+" Is divisible by 5");
            else
            {
                System.out.println(b+" Is not divisible by 5");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}










public class MultiPrograms {
    public static void main(String[] args) {

        divby8 c=new divby8();
        c.start();
        Scanner s=new Scanner(System.in);

        System.out.println("\nEnter the number to check even or odd:");
        int a = s.nextInt();
        EvenAndOdd e=new EvenAndOdd(a);
        e.start();
        System.out.println("Enter the number to check whether divisible by 5 or not:");
        int b=s.nextInt();
        Five f=new Five(b);
        f.start();

    }

}
