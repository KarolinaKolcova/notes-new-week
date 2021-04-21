package model;

public class Categories {

    private String name;
    private String importanceLevel;

    public Categories(String name, String importanceLevel) {
        this.name = name;
        this.importanceLevel = importanceLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImportanceLevel() {
        return importanceLevel;
    }

    public void setImportanceLevel(String importanceLevel) {
        this.importanceLevel = importanceLevel;
    }
}
