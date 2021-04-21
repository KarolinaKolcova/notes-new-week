import model.MainNote;
import model.Patient;
import model.enums.Notes;

import java.util.List;

public class AllWeekNotes {
    public static void main(String[] args) {
        MainNote diagnostics = new MainNote(Notes.DUPLEX, 20);

        //System.out.println(call.getName());
        System.out.println("This notes is: " + diagnostics.getName());

        diagnostics.addPatient(new Patient("Dmitrijs", "DM.", "dima@dm.lv"));
        diagnostics.addPatient(new Patient("Nikolajs", "Pops", "nik@po.lv"));
        diagnostics.addPatient(new Patient("Marite", "Broka", "marite@br.lv"));

        //System.out.println(call.getPatients().size());
        //  System.out.println(call.getPatients().get(0).getFirstName());

        List<Patient> patients = diagnostics.getPatients();

        for (int i = 0; i < patients.size(); i++) {
            System.out.println(patients.get(i).getFirstName() + " " + patients.get(i).getLastName());

            for (Patient s : patients) {
                System.out.println(s.getFirstName() + " " + s.getLastName());

                if (s.getFirstName().startsWith("D")) {
                    System.out.println(s.getFirstName() + " " + s.getLastName());
                } else {
                    System.out.println("This name not starting from 'D'");
                }
            }
        }
    }
}
