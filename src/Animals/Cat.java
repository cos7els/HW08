package Animals;

public class Cat extends Animal {

    public Cat() {
        super("Kitekat", "Home");
    }

    public void eat() {
        System.out.printf("The cat is eating %s\n", this.getFood().toLowerCase());
    }

    public void makeNoise() {
        System.out.println("Meow, meow");
    }


}
