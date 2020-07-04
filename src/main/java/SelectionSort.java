public class SelectionSort {
    public static int[] selectionSort(int[] array, SelectionMode mode){
        int[] result;
        if(mode == SelectionMode.ASCENDING){
            result = sortAscending(array);
        }else{
            result = sortDescending(array);
        }
        return result;
    }

    private static int[] sortDescending(int[] array) {
        int counter = 0;
        int maximum;
        int maximumIndex;
        int tmp;
        while(counter < array.length){
            maximum = array[counter];
            maximumIndex = counter;
            for (int i = counter; i < array.length; i++) {
                if(array[i] > maximum){
                    maximum = array[i];
                    maximumIndex = i;
                }
            }
            tmp = array[counter];
            array[counter] = maximum;
            array[maximumIndex] = tmp;

            counter++;
        }
        return array;
    }

    private static int[] sortAscending(int[] array) {
        int counter = 0;
        int minimum;
        int minimumIndex;
        int tmp;
        while(counter < array.length){
            minimum = array[counter];
            minimumIndex = counter;
            for (int i = counter; i < array.length; i++) {
                if(array[i] < minimum){
                    minimum = array[i];
                    minimumIndex = i;
                }
            }
            tmp = array[counter];
            array[counter] = minimum;
            array[minimumIndex] = tmp;

            counter++;
        }
        return array;
    }
}
