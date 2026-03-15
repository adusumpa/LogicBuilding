package phase1.level3;
//Take a 3-digit number and check if all digits are distinct.
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 3 numbers: ");
        int a = sc.nextInt();
        sc.close();
        if(a>=100 && a<=999){
            int d1= a/100;
            int d2= (a/10)%10;
            int d3= a%10;
            if(d1!=d2 && d2!=d3 && d3!=d1){
                System.out.println("All digits are Distinct");
            }else {
                System.out.println("All digits are not Distinct");
            }
        }else{
            System.out.println("Enter the valid digit between 100-999");
        }

    }

}
