package phase2.level1;
//Print the sum of first n natural numbers.
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int sum =0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum+i;
        }
        System.out.println("The sum is "+sum);
    }
}
