package phase2.level2;
//Check if a number is a perfect number
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter number: ");
            int n = sc.nextInt();
            int sum =0;
            if (n <= 1) {
                System.out.println("Not perfect");
                return;
            }
            for (int i = 1; i < n/2; i++) {
                if (n % i == 0)
                    sum += i;
            }
            System.out.println(sum == n ? "Perfect" : "Not perfect");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

