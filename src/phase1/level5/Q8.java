package phase1.level5;

import java.util.Scanner;
//Take an integer (1–9999) and check if the sum of its digits is greater than the product
//of its digits
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number (1–9999)");
        try{
            int a=sc.nextInt();
            sc.close();
            int tmp=a, sum=0, prod=1;
            while (tmp > 0)
            {
                sum += tmp%10;
                prod *= tmp%10;
                tmp /= 10;
            }
            System.out.println(sum > prod ? "Sum greater" : "Product greater or equal");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

