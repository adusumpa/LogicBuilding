package phase1.level5;
// Take two dates (day and month) and determine which one comes first in the
//calendar

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter day and month for date 1:");
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();

            System.out.println("Enter day and month for date 2:");
            int d2 = sc.nextInt();
            int m2 = sc.nextInt();
            sc.close();
            if (m1 < m2)
                System.out.println("Date 1 comes first");
            else if (m2 < m1)
                System.out.println("Date 2 comes first");
            else {
                if (d1 < d2)
                    System.out.println("Date 1 comes first");
                else if (d2 < d1)
                    System.out.println("Date 2 comes first");
                else
                    System.out.println("Both dates are the same");
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
