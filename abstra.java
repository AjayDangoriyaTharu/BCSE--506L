interface Examples {
    void learnPY();

    void learnJava();

    void learnC();
}

abstract class Coder implements Examples {
    public void learnPY() {
        System.out.println("Learning Python");
    }

    public void learnJava() {
        System.out.println("Learning Java");
    }
}

public class abstra extends Coder {
    public void learnC() {
        System.out.println("learning C++");
    }

    public static void main(String[] args) {
        abstra ab = new abstra();
        ab.learnC();
        ab.learnJava();
        ab.learnPY();

    }

}
