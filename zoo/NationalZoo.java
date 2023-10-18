// NationalZoo.java 
package zoo;

import animal.*;

public class NationalZoo {
    public static void main(String[] args) {
        Lion lion = new Lion("Yellow", 5);
        Elephant elephant = new Elephant("Gray", 10);
        System.out.println("Welcome to the National Zoo!");
        System.out.println("----------------------------");
        lion.printCharacteristics();
        System.out.println();
        elephant.printCharacteristics();
    }
}