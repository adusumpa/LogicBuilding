package phase1.level1;
//Take two numbers and print the larger one
import java.util.Scanner;
public class Q6_2numLarger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        if(a== b){
            System.out.println("Both Numbers are equal");
        }else if(a>b){
            System.out.println(a+ " is greater");
        }else{
            System.out.println(b+ " is greater");
        }
    }
}
