
package animal;

public class Lion {
    private String color;
    private int age;

    public Lion(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public boolean isVegetarian() {
        return false; // Lions are not vegetarian
    }

    public String getSound() {
        return "Roar!";
    }

    public void printCharacteristics() {
        System.out.println("Lion:");
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Is Vegetarian: " + isVegetarian());
        System.out.println("Sound: " + getSound());
    }
}