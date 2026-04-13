package phase1.level5;
//Take a year and print the corresponding century (e.g., “19th century”, “20th century”)
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        try{

            int yr = sc.nextInt();
            sc.close();
            int century = (yr + 99) / 100;

            String suffix;
            if (century == 1) suffix = "st";
            else if (century == 2) suffix = "nd";
            else if (century == 3) suffix = "rd";
            else suffix = "th";

            System.out.println(century + suffix + " century");

        }catch(Exception e){
            System.out.println(e);
        }


    }
}
