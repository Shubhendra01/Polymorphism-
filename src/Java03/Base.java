package Java03;

class Base {
    void display(){
        System.out.println("Parent class");
    }

}

class Child extends Base{

    @Override
    void display() {
        super.display();
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.display();

    }

}
