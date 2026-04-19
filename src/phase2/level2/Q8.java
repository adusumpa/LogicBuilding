package phase2.level2;
//Check if a number is prime or not
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = input.nextInt();
            boolean isPrime  = true;
            for(int i=2; i*i<=n;i++){
                if (n%i==0) {
                    isPrime=false;
                    break;
                }
            }
            System.out.println(n>1 && isPrime ? "Prime" : "Not prime");
        }
    }
}
