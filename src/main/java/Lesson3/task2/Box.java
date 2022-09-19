package Lesson3.task2;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Box<T extends Fruits>{
      private ArrayList<T> fruitList;


    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
        System.out.println("Fruit " + fruit.getName() + " added to fruit-box.");
    }

    public float getTotalWeight(){
        float totalWeight = 0;
        for(T t: fruitList){
            if(t!=null) {
                float value = (float) t.getWeight();
                totalWeight = totalWeight + value;
            }
        }
        return totalWeight;
    }

    public Boolean compareBox(@NotNull Box box){
        return this.getTotalWeight() == box.getTotalWeight();
    }

    public void boxToBox(@NotNull Box<T> box){
        System.out.println("The first box of fruit contained: " + this.getTotalWeight());
        System.out.println("The second box of fruit contained: " + box.getTotalWeight());
        this.fruitList.addAll(box.fruitList());
        box.fruitList().clear();
        System.out.println("The first box of fruit became: " + this.getTotalWeight());
        System.out.println("In the second box of fruit became: " + box.getTotalWeight());
    }

    private ArrayList<T> fruitList() {
        return fruitList;
    }


}