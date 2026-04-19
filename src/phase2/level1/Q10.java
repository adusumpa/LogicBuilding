package phase2.level1;
//Print the product of digits of a given number
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        sc.close();
        int prod =1;
        while (n > 0) {
            prod = prod * (n%10);
            n = n/10;
        }
        System.out.println(prod);
    }
}
