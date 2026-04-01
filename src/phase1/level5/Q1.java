package phase1.level5;
//Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the
//origin

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of co-ordinates");

        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.close();
            if(x==0 && y==0){
                System.out.println("origin");
            }else if(x==0){
                System.out.println("y-axis");
            }else if(y==0){
                System.out.println("x-axis");
            }else{
                System.out.println("Point is not on any axis");
            }
        }catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}
