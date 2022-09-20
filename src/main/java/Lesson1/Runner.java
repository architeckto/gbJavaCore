package main.java.Lesson1;

public class Runner extends Athletes{
    int run;


    public Runner(String name, String specialization, int run) {
        super(name, specialization);
        this.run = run;
    }


//    public void running(){
//        System.out.println(getSpecialization() + " " + getName() + " пробежал " + run + " метров.");
//    }

    public int getRun() {
        return run;
    }

    @Override
    public String toString() {
        return super.toString() + " может пробежать " + run + " метров.";
    }


}