package Lesson1;

public abstract class Athletes {
    private final String name;
    private final String specialization;

    public Athletes(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String toString(){
        return getSpecialization() + " " + getName();
    }
}