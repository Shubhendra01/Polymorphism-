package Java03;

public class Poly {

    public int AddNumbers(int x, int y) {
        return x + y;
    }

    public int AddNumbers(int x, int y, int z) {
        return x + y + z;
    }


    public static void main(String[] args) {

        Poly ob = new Poly();
        int result1 = ob.AddNumbers(12, 60);
        int result2 = ob.AddNumbers(12, 23, 60);
        System.out.println(result1);
        System.out.println(result2);

    }
}