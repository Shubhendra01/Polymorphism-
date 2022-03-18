package Java03;

public interface Bank {
    void getbalance();
}

class BankA implements Bank{
    @Override
    public void getbalance() {
        System.out.println("Deposited: $100 ");
    }
}
class BankB implements Bank {
    @Override
    public void getbalance() {
        System.out.println("Deposited: $150 ");
    }
}
class BankC implements Bank {
    @Override
    public void getbalance() {
        System.out.println("Deposited: $200 ");
    }
}
class People{
    public static void main(String[] args) {
        BankA bA=new BankA();
        bA.getbalance();

        BankB bB=new BankB();
        bB.getbalance();

        BankC bC=new BankC();
        bC.getbalance();
    }
}