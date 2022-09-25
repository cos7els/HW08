package Animals;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return this.food;
    }

    public String getLocation() {
        return this.location;
    }

    public void eat() {
        System.out.println("The animal is eating");
    }

    public void makeNoise() {
        System.out.println("The animal is noising");
    }

    public void sleep() {
        System.out.printf("The %s is sleeping\n", this.getClass().getSimpleName().toLowerCase());
    }

}
