import java.util.Arrays;

public class GenericBinarySearch<T extends Comparable<T>> {
    public int binarySearch(T[] array, T searchedValue){
        Arrays.sort(array, Comparable::compareTo);
        System.out.println(Arrays.toString(array));
        int low = 0;
        int high = array.length - 1;
        int mid;
        while(low <= high){
            mid = (low + high) / 2;
            if(array[mid] == searchedValue){
                return mid;
            } else if(array[mid].compareTo(searchedValue) < 0){
                low = mid + 1;
            } else if(array[mid].compareTo(searchedValue) > 0){
                high = mid - 1;
            }
        }
        return -1;
    }
}
