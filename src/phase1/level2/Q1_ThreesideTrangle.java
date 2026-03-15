package phase1.level2;
//1. Take three sides and check if they form a valid triangle.
import java.util.Scanner;
public class Q1_ThreesideTrangle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 3 side details: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if(a>0 && b>0 && c>0) {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                System.out.println("This is a Triangle");
            } else {
                System.out.println("This is not a Triangle");
            }
        }else{
            System.out.println("sides value must be positive");
        }
    }
}
