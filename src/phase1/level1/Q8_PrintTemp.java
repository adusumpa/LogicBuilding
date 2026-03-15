package phase1.level1;
//Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
import java.util.Scanner;
public class Q8_PrintTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temparature");
        int temp = sc.nextInt();
        if (temp < 15) {
            System.out.println("Cold");
        }else if(temp <= 30) {
            System.out.println("Warm");
        }else{
            System.out.println("Hot");
        }

    }
}
