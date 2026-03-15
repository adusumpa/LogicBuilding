package phase1.level3;

//Check whether a given integer is single-digit, double-digit, or multi-digit.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        sc.close();
       int num = Math.abs(a);

       if(num<=9){
           System.out.println("entered number is single digit");
       }else if(num>9 && num<100){
           System.out.println("entered number is double digit");
       }else{
           System.out.println("entered number is Multi digit");
       }

    }
}
