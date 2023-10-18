import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner s =  new Scanner(System.in);
        System.out.print("Enter the value of a & b : ");
        a=s.nextInt();
        b= s.nextInt();
        System.out.println("Num.. before swap : "+a +" "+b );
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Number after swap : "+a +" "+b);
    }
}