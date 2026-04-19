package phase2.level2;
//Check if a number is a palindrome
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number");
            int n = sc.nextInt();
            int rev =0;
            int lastdigit =0;
            n = Math.abs(n);
            int original = n;
                while(n>0){
                   lastdigit = n%10;
                   rev = rev*10 + lastdigit;
                   n = n/10;
                }
                if(original==rev){
                    System.out.println("Yes, a palindrome number");
                }else {
                    System.out.println("Not a palindrome number");
                }

        }catch(Exception e){
            System.out.println("Invalid input"+e);
        }
    }
}
