package Clinic;

public class Patient {
    private MedicalPlan medicalPlan;

    public Patient() {
        this.medicalPlan = new MedicalPlan();
        System.out.printf("The patient have a medical plan with code %d\n", this.medicalPlan.getCode());
    }

    public MedicalPlan getMedicalPlan() {
        return this.medicalPlan;
    }
}
