package Lesson3.task2;

public abstract class Fruits<T,U extends Number> {

    private T name;

    private U weight;

    public Fruits(T name, U weight) {
        this.name = name;
        this.weight = weight;
    }

    public T getName() {
        return name;
    }

    public U getWeight() {
        return weight;
    }
}
