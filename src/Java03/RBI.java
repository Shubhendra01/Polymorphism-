package Java03;

public interface RBI{
    void setInterestRate();
}

class SBI implements RBI{
    public void setInterestRate(){
        System.out.println("7% Interest");
    }
}

class ICICI implements RBI{
    public void setInterestRate(){
        System.out.println("7.5% Interest");
    }
}
 class Person{
     public static void main(String[] args) {
         RBI ob_Sbi=new SBI();
         RBI ob_Icici=new ICICI();
         System.out.println("SBI Bank => ");
         ob_Sbi.setInterestRate();
         System.out.println("ICICI Bank => ");
         ob_Icici.setInterestRate();
     }
 }