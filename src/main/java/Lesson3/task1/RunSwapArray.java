package Lesson3.task1;

import java.util.Arrays;

public class RunSwapArray {

    static String[] arrayStr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {

        SwapElementsArray<String> swapElementsArr = new SwapElementsArray<>();

        try {
            System.out.println(Arrays.toString(swapElementsArr.swapElements(arrayStr, 0, 6)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}
