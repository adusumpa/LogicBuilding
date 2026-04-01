package phase1.level4;
//Take 24-hour time (hours and minutes) and print whether it is AM or PM.
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        try{
            int hours = sc.nextInt();
            int minutes = sc.nextInt();
            sc.close();
            if(hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59){
                if(hours < 12){
                    System.out.println("AM");
                } else {
                    System.out.println("PM");
                }
            } else {
                System.out.println("Invalid time!");
            }

        }catch(Exception e){
            System.out.println("Enter valid digit");
        }


    }
}
