package Clinic;

public class Therapist implements Doctor {

    @Override
    public void heal(Patient patient) {
        System.out.println("The patient is healed by the therapist");
    }

}
