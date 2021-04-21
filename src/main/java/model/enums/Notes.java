package model.enums;

public enum Notes {
    DUPLEX("Ultrasound non-invasive diagnostic"),
    EHO("Echocardiographi"),
    FGS("Fibrogastroscopy");

    private String name;

    Notes (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
