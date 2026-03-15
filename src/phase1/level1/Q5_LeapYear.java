package phase1.level1;
//Check if a given year is a leap year
import java.util.Scanner;
public class Q5_LeapYear {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int x = sc.nextInt();
        sc.close();

        if(x%4==0){
            if(x%100==0){
                if(x%400==0){

                    System.out.println("Entered year is leap year");
                }else{
                    System.out.println("Entered year is not leap year");
                }
            }else{
                System.out.println("Entered year is leap year");
            }

        }else{
            System.out.println("Entered year is not leap year");
        }
    }
}
