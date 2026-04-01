package phase1.level4;
//Take a weekday number (1–7) and determine if it is a weekday or weekend
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number b/w 1-7:");
        try{
            int a = sc.nextInt();
            if(a>=1 && a<=7){
                if(a==6 || a==7){
                    System.out.println("Weekend");
                }else{
                    System.out.println("Weekday");
                }
            }else{
                System.out.println("Invalid input,Enter a number b/w 1-7:");

            }
        }catch(Exception e){
            System.out.println("Invalid Input");
        }

    }
}
