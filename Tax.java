import java.util.*;
public class Tax {
    // calaulate tax.............
    public static void main(String[] args) {
        double income, tax1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income : ");
        income = sc.nextDouble();
        System.out.print("Enter the Catogary GN for General  WM for women : ");
        String cato = sc.next();
        System.out.println("Income Amount is : " + income);
        System.out.println("Catogary is : " + cato);
        if (cato.equals("GN")) {
            if (income <= 180000) {
                tax1 = 0;
                System.out.println("Tax Amount is :" + tax1);
            } else if (income < 500000) {
                tax1 = (income - 180000) * 0.1;
                System.out.println("Tax Amount is :" + tax1);
            } else if (income < 800000) {
                tax1 = (0.2 * (income - 500000)) + (0.1 * 320000);
                System.out.println("Tax Amount is :" + tax1);
            } else {
                tax1 = (0.3 * (income - 800000)) + (0.2 * 300000) + (0.1 * 320000);
                System.out.println("Tax Amount is :" + tax1);
            }
        } else if (cato.equals("WM")) {
            if (income <= 190000) {
                tax1 = 0;
                System.out.println("Tax Amount is :" + tax1);
            } else if (income < 500000) {
                tax1 = (income - 190000) * 0.1;
                System.out.println("Tax Amount is :" + tax1);
            } else if (income < 800000) {
                tax1 = (0.2 * (income - 500000)) + (0.1 * 310000);
                System.out.println("Tax Amount is :" + tax1);
            } else {
                tax1 = (0.3 * (income - 800000)) + (0.2 * 300000) + (0.1 * 320000);
                System.out.println("Tax Amount is :" + tax1);
            }
        } else {
            System.out.println("INVALID......");
        }

    }
}