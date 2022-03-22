package Java03;
import java.util.Scanner;

class AddOperation extends Thread{
int a,b;
    public AddOperation(int a,int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void run(){
        try{
            System.out.println(a+b);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

class SubOperation extends Thread{
    int a,b;
    public SubOperation(int a,int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void run(){
        try{
            System.out.println(a-b);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class MulOperation extends Thread {
    int a, b;

    public MulOperation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        try {
            System.out.println(a * b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class DivOperation extends Thread {
    int a, b;

    public DivOperation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        try {
            System.out.println(a % b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


public class MultiCalculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Num 1:");
        int x=s.nextInt();
        System.out.println("Num 2:");
        int y=s.nextInt();

        AddOperation a=new AddOperation(x,y);
        a.start();
        SubOperation b=new SubOperation(x,y);
        b.start();
        MulOperation c=new MulOperation(x,y);
        c.start();
        DivOperation d=new DivOperation(x,y);
        d.start();

    }




}
