package Java03;

public class Check {

    public static void main(String[] args) {
        try{
            int x=10, y=0, z;
            z=x/y;
            System.out.println(z);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by 0 is not Possible");
        }
        catch (NullPointerException e)
        {
            System.out.println("Null Value is not accepted");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
