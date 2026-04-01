package phase1.level5;

import java.util.Scanner;

//Take three numbers and check if they can form a Pythagorean triplet
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 3 sides of the triangle: ");
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max, s1, s2;
            sc.close();
            if (a >= b && a >= c) {
                max = a;
                s1 = b;
                s2 = c;
            } else if (b >= a && b >= c) {
                max = b;
                s1 = a;
                s2 = c;
            } else {
                max = c;
                s1 = a;
                s2 = b;
            }
            if (max * max == s1 * s1 + s2 * s2) {
                System.out.println("The triangle is Pythagorean triplet");
            } else {
                System.out.println("The triangle is not Pythagorean triplet");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
