package Animals;

public class Dog extends Animal {

    public Dog() {
        super("Pedigree", "Home");
    }

    public void eat() {
        System.out.printf("The dog is eating %s\n", this.getFood().toLowerCase());
    }

    public void makeNoise() {
        System.out.println("Woof, woof");
    }
}
