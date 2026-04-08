package phase1.level5;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{

            int a  = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int min=0, mid=0, max=0;
            if(a>=b && a>=c){
                max= a;
                if(b>=c){
                    mid= b;
                    min=c;
                }else{
                    mid= c;
                    min=b;
                }
            } else if(b>=a && b>=c){
                max= b;
                if(a>=c){
                    mid= a;
                    min=c;
                }else{
                    mid= c;
                    min=a;
                }
            }else{
                max= c;
                if(a>=b){
                    mid= a;
                    min=b;
                }else{
                    mid= b;
                    min=a;
                }
            }

            if ((mid - min) == (max - mid)) {
                System.out.println("Yes, Arithmetic Progression");
            }else
                System.out.println("No, not Arithmetic Progression");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
