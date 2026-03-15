package phase1.level2;
//Check voting eligibility for a given age (18+)
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        if(a>0){
            if(a>=18){
                System.out.println("Eligible for voting");
            }else{
                System.out.println("inEligible for voting");
            }
        }else{
            System.out.println("Invalid input");
        }
    }
}
