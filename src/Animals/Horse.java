package Animals;

public class Horse extends Animal {

    public Horse() {
        super("Grass", "Outdoor");
    }

    public void eat() {
        System.out.printf("The horse is eating %s\n", this.getFood().toLowerCase());
    }

    public void makeNoise() {
        System.out.println("I don't know how a horse is noising");
    }
}
