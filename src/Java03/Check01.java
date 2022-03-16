package Java03;

public class Check01 {
    public static void main(String[] args) {
        try{
            String name="Hello";
            System.out.println(name);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by 0");
        }
        catch (NullPointerException e)
        {
            System.out.println("Null Pointer exception");
        }
        catch (Exception e) {
            System.out.println("Exception arrised" + e);
        }
        finally {
            System.out.println("Hello no worries");
        }
    }
}

