package Lesson1;

public class Team{

    private final String name;
    private final Runner[] runners;

    public Team(String name, Runner[] runners) {
        this.name = name;
        this.runners = runners;
    }



    public String getName() {
        return name;
    }

    public Runner[] getRunners() {
        return runners;
    }
}