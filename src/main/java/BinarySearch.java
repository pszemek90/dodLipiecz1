import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int searchedValue){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int low = 0;
        int high = array.length - 1;
        int mid;
        while(low <= high){
            mid = (low + high) / 2;
            if(array[mid] == searchedValue){
                return mid;
            } else if(array[mid] < searchedValue){
                low = mid + 1;
            } else if(array[mid] > searchedValue){
                high = mid - 1;
            }
        }
        return -1;
    }
}
