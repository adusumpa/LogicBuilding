package phase2.level2;
//Check if a number is an Armstrong number

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int n  = sc.nextInt();
            n = Math.abs(n);
            int d = String.valueOf(n).length();
            int orig = n;
            int sum =0;
            while(n>0){
                sum += (int)Math.pow(n%10, d);
                n/=10;
            }
            System.out.println(sum == orig ? "Armstrong" : "Not Armstrong");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
