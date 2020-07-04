import java.util.Arrays;

public class SelectionSortMain {
    public static void main(String[] args) {
        int[] array = {5,6,2,1,4,8,9,7,3,0,21};
        System.out.println(Arrays.toString(SelectionSort.selectionSort(array, SelectionMode.ASCENDING)));
        System.out.println(Arrays.toString(SelectionSort.selectionSort(array, SelectionMode.DESCENDING)));
    }
}
