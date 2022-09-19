package Lesson2;

public class AppRun {
    public static void main(String[] args) throws MyArrayDataException {

        String[][] arrayStringToInt = {{"1", "2", "3", "four"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        String[][] arrayOutSize = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"},
                {"13", "14", "15"}, {"13", "14", "15"}};
        String[][] arrayNormal = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};


        CheckException testArrays = new CheckException();


        testArrays.arrayChecking(arrayNormal);


        try {
            testArrays.arrayCheckingSize(arrayOutSize);
        }catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива \n" + "По горизонтали: " + arrayOutSize.length + "\n" +
                    "По вертикали: " + arrayOutSize[0].length);
        }


        try {
            testArrays.arrayChecking(arrayStringToInt);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}