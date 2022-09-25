package Phone;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this.number = String.valueOf((int) (Math.random() * 100000));
        this.model = "iPhone " + (int) (Math.random() * 10);
        this.weight = Math.random() * 100;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void recieveCall(String name) {
        System.out.printf("Calling %s\n", name);
    }

    public void recieveCall(String name, String number) {
        System.out.printf("Calling %s %s\n", name, number);
    }

    public void sendMessage(String ... numbers) {
        Arrays.stream(numbers).forEach(s -> System.out.printf("Send message from %s to %s\n", this.getNumber(), s));
    }

    public void about() {
        System.out.printf("Phone: number = %s, model = %s, weight %f\n", this.number, this.model, this.weight);
    }

}
