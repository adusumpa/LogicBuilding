package phase2.level2;
//Print the reverse of a given number.
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int rev = 0;

                boolean isNegative = n<0;

            n = Math.abs(n);
            while(n>0){
               int lastdigit = n%10;
               rev =  rev*10 + lastdigit;
                n = n/10;
            }
            if (isNegative) rev = -rev;
            System.out.println("reverse of a given number is " + rev);
        }catch(Exception e) {
            System.out.println("Invalid Input :"+e);
        }
    }
}
