package phase2.level2;
//Sum of first n Fibonacci terms
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n in Fibonacci series up to n terms");
        int n=sc.nextInt();
        sc.close();
        int a= 0, b=1;
        long sum = 0;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            sum+= a;
            int c= a+b;
            a=b;
            b=c;
        }
        System.out.println();
        System.out.println("total sum of fibonnnaci: "+sum);
    }
}
