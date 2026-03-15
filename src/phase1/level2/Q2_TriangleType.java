package phase1.level2;
import java.util.Scanner;
//If the sides form a valid triangle, determine whether it is equilateral, isosceles, or
//scalene
public class Q2_TriangleType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a>0 && b>0 && c>0) {
            if (a + b > c && a + c > b && b + c > a) {
                if ((a == b) && (b == c) && (c == a)) {
                    System.out.println("Triangle is equilateral");
                } else if ((a == b) || (b == c) || (c == a)) {
                    System.out.println("Triangle is isosceles");
                } else {
                    System.out.println("Triangle is scalene");
                }
            } else {
                System.out.println("Invalid Input, sides values must be greater than zero");
            }
        }
    }

}
