package phase1.level5;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month and date: ");
        try{
            int month = sc.nextInt();
            int day = sc.nextInt();
            int maxdays = 0;
            sc.close();

            if(month > 12 || month < 1 || day > 31 || day < 1){
                System.out.println("Invalid data");
            }else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        maxdays = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        maxdays = 30;
                        break;
                    case 2:
                        maxdays = 28;
                        break;
                }

                if (day >= 1 && day <= maxdays) {
                    System.out.println("valid date");
                } else {
                    System.out.println("Not a calender date");
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
