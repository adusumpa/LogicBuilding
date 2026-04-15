package phase2.level1;
//Print the sum of all even numbers up to n
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n  = sc.nextInt();
        sc.close();
        int sum =0;
        for(int i=2;i<=n;i+=2){
            sum+=i;
        }
        System.out.println("sum of all even numbers up to "+n+" is "+sum);
    }
}
