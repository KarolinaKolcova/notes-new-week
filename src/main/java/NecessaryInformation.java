import model.Patient;

public class NecessaryInformation {
    public static void main(String[] args) {
    Patient valerij = new Patient();
    valerij.setFirstName("Valerij");
    valerij.setLastName("Bobo");
    valerij.setEmail("valeri@bo.lv");

    Patient marina = new Patient();
    marina.setFirstName("Marina");
    marina.setLastName("Birek");
    marina.setEmail("mari@rek.lv");

    Patient jerry = new Patient();
    jerry.setFirstName("Jerry");
    jerry.setLastName("Sheron");
    jerry.setEmail("jerry@shen.lv");

      // System.out.println(valerij.getFirstName() + " " + valerij.getLastName());
       // System.out.println(valerij.getEmail());

        valerij.printFullInfo();
        marina.printFullInfo();
        jerry.printFullInfo();


    }
}
