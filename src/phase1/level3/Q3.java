package phase1.level3;
//Take a 4-digit number and check if the first and last digits are equal
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        sc.close();
        if(a>=1000 && a<=9999){
            int d1 = a/1000;
            int d2 = (a/100)%10;
            int d3 = (a/10)%10;
            int d4 = a%10;
            if(d1==d4){
                System.out.println("First and last digits are equal");
            }else{
                System.out.println("First and last digits are not equal");
            }
        }else{
            System.out.println("Invalid number, enter b/w 1000-9999");
        }

    }
}
