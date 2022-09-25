package Clinic;

public class Clinic {
    private Doctor[] doctors = new Doctor[3];

    public Clinic() {
        doctors[0] = new Therapist();
        doctors[1] = new Surgery();
        doctors[2] = new Dentist();
    }

    public void sendToDoctor(Patient patient) {
        Doctor doctor = patient.getMedicalPlan().getCode() > 2 || patient.getMedicalPlan().getCode() < 1 ? doctors[0] :
                patient.getMedicalPlan().getCode() == 1 ? doctors[1] : doctors[2];
        System.out.printf("The patient with code %d is directing to the %s\n", patient.getMedicalPlan().getCode(),
                doctor.getClass().getSimpleName().toLowerCase());
        doctor.heal(patient);
    }
}
