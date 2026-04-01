package phase1.level4;
//Take two numbers and check if both are positive and their sum is less than 100

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>0 && b>0 && (a+b<100)){
                System.out.println("Both positive and sum < 100");
            }else{
                System.out.println("Not satisfied");
            }

        }catch(Exception e){
            System.out.println("Invalid input");
        }

    }
}
