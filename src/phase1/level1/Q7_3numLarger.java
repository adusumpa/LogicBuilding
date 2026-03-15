package phase1.level1;

import java.util.Scanner;
//Take three numbers and print the largest
public class Q7_3numLarger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a > b && a > c) {
            System.out.println(a + " is larger");
        } else if ((b > a) && (b > c)) {
            System.out.println(b + " is larger");
        } else {
            System.out.println(c + " is larger");
        }

    }
}

