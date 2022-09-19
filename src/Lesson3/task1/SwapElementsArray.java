package Lesson3.task1;

public class SwapElementsArray<E> {

    E temp;

    public Object[] swapElements(E[]array, int indexA, int indexB) {
        temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
        return array;
    }
}
