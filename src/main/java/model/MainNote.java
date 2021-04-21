package model;

import model.enums.Notes;

import java.util.ArrayList;
import java.util.List;

public class MainNote {
    private Notes name;
    private int duration;
    private List<Patient> patients = new ArrayList<>();

    public MainNote(Notes name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public Notes getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}
