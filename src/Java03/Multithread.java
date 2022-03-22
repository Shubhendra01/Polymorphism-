package Java03;

class Task1 extends Thread{
    @Override
    public void run(){
        System.out.println("Task1 Thread Executed-"+ Thread.currentThread().getName());
    }
}
class Task2 extends Thread{
    @Override
    public void run(){
        System.out.println("Task2 Thread Executed-"+ Thread.currentThread().getName());
    }
}
class Task3 extends Thread{
    @Override
    public void run(){
        System.out.println("Task3 Thread Executed-"+ Thread.currentThread().getName());
    }
}

public class Multithread {
    public static void main(String[] args) {

        Task1 t1=new Task1();
        Task2 t2=new Task2();
        Task3 t3=new Task3();
        t1.start();
        t2.start();
        t3.start();

    }
}
