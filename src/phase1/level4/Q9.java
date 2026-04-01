package phase1.level4;
//Take electricity units consumed and calculate the bill as per slabs (using if-else)

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the electicity units:");
        try {
            int units = sc.nextInt();
            if (units < 0) {
                System.out.println("Enter positive numbers");
            } else if (units >= 1 && units < 100) {
                int bill = 5 * units;
                System.out.println("Bill:  " + bill);
            } else if (units >= 100 && units < 500) {
                int bill = 10 * units;
                System.out.println("Bill:  " + bill);
            } else {
                int bill = 15 * units;
                System.out.println("Bill:  " + bill);
            }

        } catch (Exception e) {
            System.out.println("Invalid input");
        }

    }
}
