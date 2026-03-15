package phase1.level2;
import java.util.Scanner;
//Take two numbers and determine whether both are even, both are odd, or one is
//even and one is odd
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a%2==0 && b%2==0){
            System.out.println("Both are even");
        } else if(a%2!=0 && b%2!=0){
            System.out.println("Both are odd");
        } else {
            System.out.println("One is even and one is odd");
        }

    }
}
