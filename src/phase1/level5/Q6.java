package phase1.level5;
//Take three
//numbers and check if they are in geometric progression.
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        try{

            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();
            sc.close();
            int max=0;
            int mid =0;
            int min=0;
            if (a>=b&&a>=c){
                max= a;
                if(b>=c){
                    mid=b;
                    min=c;
                }else{
                    mid=c;
                    min=b;
                }
            }else if (b>=a&&b>=c){
                max=b;
                if(a>=c){
                    mid=a;
                    min=c;
                }else{
                   mid= c;
                    min=a;
                }
            }else {
                max= c;
                if(a>=b){
                    mid= a;
                    min=b;
                }else{
                    mid= b;
                    min=a;
                }
            }
            if (min == 0 || mid == 0||max == 0) {
                System.out.println("GP not defined with 0");
            }
           else{
                System.out.println(mid*mid == min*max ? "GP" : "Not GP");
            }
        }catch(Exception e){
         System.out.println(e);
        }
    }
}
