package phase1.level3;
// Take a 3-digit number and determine if the middle digit is the largest, smallest or neither
import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the 3 digit number: ");
        int a = sc.nextInt();
        sc.close();
        if(a>=100 && a<=999){
            int d1 = a/100;
            int d2 = (a/10)%10;
            int d3 = a%10;

            if(d2>d1 && d2>d3){
                System.out.println("Middle digit is larger");
            }else if(d2<d1 && d2<d3){
                System.out.println("Middle digit is smaller");
            }else{
                System.out.println("Middle digit is not larger or smaller");
            }
        }else{
            System.out.println("Invalid input enter between 100-999");
        }
    }
}
