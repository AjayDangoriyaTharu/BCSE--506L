import java.util.Scanner;
public class egg {
    public static void main(String[] args) {
        int eggs;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Eggs : ");
        eggs = sc.nextInt();
        int gross = eggs/144;
        int abovegross = eggs%144;
        int dozon = abovegross/12;
        int extras = abovegross%12;
        System.out.println("Num of eggs : "+eggs);        
        System.out.println("Num of gross : "+gross);
        System.out.println("Num of  aboveGross : "+abovegross);
        System.out.println("Num of Dozon : "+dozon);
        System.out.println("Num of Extras : "+extras);
    }
}
