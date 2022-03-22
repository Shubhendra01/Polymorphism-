package Java03;

class RBI{
    void getInterestRate(){
        System.out.println("The interest is: 7%");
    }
}

class SBI extends RBI{
    @Override
     void getInterestRate() {
        System.out.println("7.5% Interest");
     }

}

class AXIS extends RBI{
    @Override
     void getInterestRate(){
        System.out.println("8% Interest");
    }
}
class ICICI extends RBI {
    @Override
    void getInterestRate() {
        System.out.println("8.5% Interest");
    }
}


class Person{
     public static void main(String[] args) {
         RBI sbi=new SBI();
         RBI axis=new AXIS();
         RBI icici=new ICICI();
         System.out.println("SBI Bank => ");
         sbi.getInterestRate();
         System.out.println("AXIS Bank => ");
         axis.getInterestRate();
         System.out.println("ICICI Bank => ");
         icici.getInterestRate();

         @SuppressWarnings("unused")
         int x;
     }
 }