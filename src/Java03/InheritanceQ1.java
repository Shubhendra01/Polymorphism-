package Java03;
import java.util.Scanner;
public class InheritanceQ1 {

    public static void main(String[] args) {
        int a, b, i, j;
        System.out.println("first nu");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.println("second nu");
        b = s.nextInt();
        for (i = a; i <= b; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(j);
            }
        }
    }
}

