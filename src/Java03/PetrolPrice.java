package Java03;

abstract class PetrolPrice {

    abstract void changePrice();

}

class Govt extends PetrolPrice{
    void changePrice()
    {
        System.out.println("Inceased by 2%");
    }

    public static void main(String[] args) {

        PetrolPrice price=new Govt();
        price.changePrice();
    }
}

class Teacher {
    String designation = "Teacher";
    String collegeName = "Beginnersbook";
    void does(){
        System.out.println("Teaching");
    }
}

