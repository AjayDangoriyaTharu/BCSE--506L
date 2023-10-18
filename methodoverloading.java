class calulator {
    int sum(int a, int b) {
        return (a + b);
    }

    double sum(double d, double e, double f) {
        return (d + e + f);
    }

    int multipy(int a, int b) {
        return (a * b);
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        calulator calc = new calulator();

        System.out.println("Sum is : " + calc.sum(15, 30));
        System.out.println("Sum is : " + calc.sum(34.5, 56.7, 456.7));
        System.out.println("Multiply is : " + calc.multipy(5, 4));

    }
}
