package Animals;

public class Vet {

    public void treatAnimal(Animal animal) {
        System.out.printf("The %s came to the treat, food = %s, location = %s\n",
                animal.getClass().getSimpleName().toLowerCase(), animal.getFood(), animal.getLocation());
    }

}
