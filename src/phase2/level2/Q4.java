package phase2.level2;
//Find the sum of digits of a number
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int n  = sc.nextInt();
             n = Math.abs(n);
            int sum =0;
            while(n>0) {
                sum =  sum+n%10;
                n/= 10;
            }

            System.out.println("sum of digits"+sum);
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
