package phase1.level2;

//Check if one of two given numbers is a multiple of the other
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
if(a>0 && b>0){
    if(a%b==0){
        System.out.println(a+" is a multiple of "+b);
    }else if(b%a==0){
        System.out.println(b+" is a multiple of "+a);
    }else{
        System.out.println(" 2 numbers are not multiple");
    }
}else{
    System.out.println("Neither is a multiple of the other");
}
    }

}
