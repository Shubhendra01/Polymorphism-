package Java03;

class Task extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Executed-"+ Thread.currentThread().getName());
    }
}
public class Multithread {
    public static void main(String[] args) {

       for (int i=0;i<10;i++)
       {
           Task t=new Task();
           t.start();
       }
    }
}
