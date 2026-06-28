package phase2.level3;
//Cubes from 1 to n
import  java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the n value to print n value in Cubes from 1 to n ");
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            System.out.println(i+"^3 ="+i*i*i);
        }

    }
}
