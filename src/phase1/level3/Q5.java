package phase1.level3;
//check if a number is a multiple of 7 or ends with 7
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        sc.close();
        if(a%7==0 || Math.abs(a)%10==7){
            System.out.println("The number is a multiple of 7 or ends with 7");
        }else{
            System.out.println("The number is not a multiple of 7 or ends with 7");
        }
    }
}
