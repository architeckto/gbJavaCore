package Lesson4.Task1;

import java.util.*;

public class AppRun {

    public static void main(String[] args) {

        String[] arrayStr = new String[30];

        Random r = new Random();
        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = String.valueOf((char) (r.nextInt(50) + 33));
        }
        System.out.println(Arrays.toString(arrayStr));

        List<String> arrayStrList = Arrays.asList(arrayStr);
        Set<String> uniqueStr = new HashSet<>(arrayStrList);
        System.out.println("Unique string count: " + uniqueStr.size());

    }

}

