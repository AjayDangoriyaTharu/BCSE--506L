import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the two number : ");
        a =s.nextInt();
        b = s.nextInt();
        int c = a+b;
        System.out.print("The sum of two number is : "+c);
    }    
}
