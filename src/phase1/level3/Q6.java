package phase1.level3;
//Take coordinates (x, y) and determine which quadrant the point lies in
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        if (x==0 && y==0){
            System.out.println("origin");
        }else if(x==0){
            System.out.println("y-axis");
        }else if(y==0){
            System.out.println("x-axis");
        }else if(x>0 && y>0){
            System.out.println("Q1");
        }else if(x<0 && y>0){
            System.out.println("Q2");
        }else if(x<0 && y<0){
            System.out.println("Q3");
        }else{
            System.out.println("Q4");
        }
    }
}
