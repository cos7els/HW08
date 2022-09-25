package Animals;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Horse();
        Vet vet = new Vet();
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.makeNoise();
            vet.treatAnimal(animal);
        }
   }

}
