package phase2.level1;
//Print the factorial of a given number
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        sc.close();
        int fac = 1;
        for (int i = n; i >= 1; i--) {
            fac = fac*i;
        }
        System.out.println("Factorial of " + n + " is " + fac);
    }
}
