
package animal;

public class Elephant {
    private String color;
    private int age;

    public Elephant(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public boolean isVegetarian() {
        return true; // Elephants are vegetarian
    }

    public String getSound() {
        return "Trumpet!";
    }

    public void printCharacteristics() {
        System.out.println("Elephant:");
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Is Vegetarian: " + isVegetarian());
        System.out.println("Sound: " + getSound());
    }
}