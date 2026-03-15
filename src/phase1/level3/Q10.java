package phase1.level3;
//Check whether a number is a perfect square (without using the square root function).
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();
        if(num < 0){
            System.out.println("Invalid! Negative numbers cant be perfect squares");
        } else {
            boolean isPerfectSquare = false;
            for(int i = 0; i <= num; i++){
                if(i * i == num){
                    isPerfectSquare = true;
                    break;
                }
            }
            if(isPerfectSquare){
                System.out.println("Perfect square");
            } else {
                System.out.println("Not a perfect square");
            }
        }
    }
}
