package Clinic;

public class MedicalPlan {
    private int code;

    public MedicalPlan() {
        this.code = (int) (Math.random() * 5);
    }

    public int getCode() {
        return this.code;
    }
}
