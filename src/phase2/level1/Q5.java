package phase2.level1;
//Print the table of a given number (n × 1 to n × 10).
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
}
