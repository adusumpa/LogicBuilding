package phase1.level5;

import java.util.Scanner;

//Take a 3-digit number and
//check if the sum of the first and last digit equals the middle
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d1=0,d2=0,d3=0;
        System.out.println("enter 3 digit number");
        try{
            int a=sc.nextInt();
            sc.close();
        d1= a/100;
        d2= (a/10)%10;
        d3= a%10;
     System.out.println(d1+d3==d2 ? "Yes":"No");
    }catch(Exception e){
        System.out.println(e);}
    }
}
