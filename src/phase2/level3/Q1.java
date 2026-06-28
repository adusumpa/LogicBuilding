package phase2.level3;
//Squares from 1 to n

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n to print Squares from 1 to n");
        int n= sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
            System.out.println(i + "^2 = " + i*i);
        }
    }
}
