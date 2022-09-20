package Lesson1;

public class Course {
    String result;
    private final int tracklength;


    public Course(int tracklength){
        this.tracklength = tracklength;

    }

    public int getTracklength() {
        return tracklength;
    }

    public String  runDownTheTrack(Team team){
        result = "Команда " + team.getName() + "\n";
        System.out.println(result);
        for (Runner runner: team.getRunners()){
            System.out.println(runner.toString());
        }
        System.out.println();
        for(Runner runner: team.getRunners()){

            int value = runner.getRun();
            tracklength(runner, value);
        }
        System.out.println();
        System.out.println(result);
        return "Finish!";
    }

    private void tracklength(Runner runner, int value) {
        if (tracklength <= value){
            result += runner.getName() + " пробежал " + tracklength + " метров из "  + tracklength + "\n";
        }else if (tracklength > runner.getRun()){
            result += runner.getName() + " пробежал " + value + " метров из " +
                    tracklength + "\n";
            //System.out.println("Дистанция слишком длинная для " + runner.getName());
        }
    }

}