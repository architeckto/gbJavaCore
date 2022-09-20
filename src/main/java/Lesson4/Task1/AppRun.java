package Lesson4.Task1;

import java.util.*;

public class AppRun {
    public static String[] arrayStr = new String[30];

    public static List<String> arrayStrList = Arrays.asList(arrayStr);

    public static void main(String[] args) {


        Random r = new Random();
        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = String.valueOf((char) (r.nextInt(50) + 33));
        }


        System.out.println(Arrays.toString(arrayStr));
        System.out.println("All string count: " + arrayStrList.size() + "\n");


        HashMap<String, Integer> result = new HashMap<>();
        for (String str : arrayStrList) {
            result.put(str, count(str));
        }
        System.out.println("Number of repetitions: \n" + result + "\n");
        Set<String> uniqueStr = new HashSet<>(arrayStrList);
        System.out.println(uniqueStr);
        System.out.println("Unique string count: " + uniqueStr.size());

    }

    public static Integer count(String str) {
        Integer result = 0;
        for (String strThis : arrayStrList) {
            if (strThis.equals(str)) result++;
        }
        return result;
    }
}

