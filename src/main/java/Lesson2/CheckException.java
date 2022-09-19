package Lesson2;

public class CheckException{

    int size = 4;
    int arrSum = 0;

//    public int getArrSum() {
//        return arrSum;
//    }

    public void arrayChecking(String[][] array) throws MyArrayDataException {

        int i = 0;
        int j = 0;
        try {

            for (i = 0; array.length > i; i++) {
                for (j = 0; array.length > j; j++) {
                    arrSum = arrSum + Integer.parseInt(array[i][j]);
                }
            }
            System.out.println("Сумма значений массива: " + arrSum);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Ошибка преобразования данных по координатам: " +
                    ("x = " + i) + "," + ("y = " + j));

        }
    }

    public void arrayCheckingSize(String[][] array) throws MyArraySizeException {
        if (array[0].length != size || array.length != size) throw new MyArraySizeException();
    }
}