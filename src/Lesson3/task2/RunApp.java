package Lesson3.task2;

public class RunApp {

    public static void main(String[] args) {

        Box<Apple> AppleBox = new Box<>();
        Box<Apple> AppleBox2 = new Box<>();
        Box<Orange> OrangeBox = new Box<>();
        Box<Orange> OrangeBox2 = new Box<>();


        AppleBox.addFruit(new Apple());
        AppleBox.addFruit(new Apple());
        AppleBox.addFruit(new Apple());
        System.out.println("Gross fruit crate weight: " + AppleBox.getTotalWeight());

        AppleBox2.addFruit(new Apple());
        AppleBox2.addFruit(new Apple());
        System.out.println("Gross fruit crate weight: " + AppleBox2.getTotalWeight());

        OrangeBox.addFruit(new Orange());
        OrangeBox.addFruit(new Orange());
        OrangeBox.addFruit(new Orange());
        System.out.println("Gross fruit crate weight: " + OrangeBox.getTotalWeight());

        OrangeBox2.addFruit(new Orange());
        OrangeBox2.addFruit(new Orange());
        System.out.println("Gross fruit crate weight: " + OrangeBox2.getTotalWeight());

        System.out.println(AppleBox.compareBox(OrangeBox2));
        System.out.println(AppleBox.compareBox(AppleBox2));

        AppleBox.boxToBox(AppleBox2);

    }
}
