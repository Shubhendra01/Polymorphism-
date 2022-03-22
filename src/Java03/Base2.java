package Java03;

public class Base2 {
    void display(){
        System.out.println("Parent class");
    }

}

class Child2 extends Base2{

    @Override
    void display() {
        System.out.println("Child class");
    }

    @Deprecated
    void Calculate(){
        System.out.println("Calculator");
    }

    public static void main(String[] args) {
        Child2 c=new Child2();
        c.display();

    }

}


