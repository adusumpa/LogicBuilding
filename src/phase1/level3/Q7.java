package phase1.level3;
//Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int a = sc.nextInt();
        sc.close();
        if(a > 0){
            if(a % 2000 == 0){
                System.out.println("Divisible by 2000");
            }
            if(a % 500 == 0){
                System.out.println("Divisible by 500");
            }
            if(a % 100 == 0){
                System.out.println("Divisible by 100");
            }
            if(a % 2000 != 0 && a % 500 != 0 && a % 100 != 0){
                System.out.println("Not divisible by any");
            }
        } else {
            System.out.println("Enter positive amount");
        }
    }
}
