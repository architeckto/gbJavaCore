package Lesson1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Runner[] runners = new Runner[4];
        runners[0] = new Runner("John", "Бегун", 300);
        runners[1] = new Runner("Smith", "Бегун", 450);
        runners[2] = new Runner("Jacob", "Бегун", 500);
        runners[3] = new Runner("Ignat", "Бегун", 700);
        Team team = new Team("Бегуны", runners);

        //System.out.println(team.getName() + "\n" + Arrays.toString(team.getRunners()));


        int num;
        do {
            System.out.println("Track length cannot be negative!");
            System.out.println("Enter track length: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                System.out.println("Enter track length: ");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num <= 0);

        Course track = new Course(num);
        System.out.println("Track length: " + track.getTracklength() + "\n");
        String result = track.runDownTheTrack(team);
        System.out.println(result);
    }
}