public class BinarySearchMain {
    public static void main(String[] args) {
        Integer[] array = {5,3,6,4,2,8,9,1,20,14,57};
        Character[] charArray = {'f','e','c','q','n'};
//        System.out.println(BinarySearch.binarySearch(array,9));
        GenericBinarySearch<Integer> genericBinarySearch = new GenericBinarySearch<>();
        System.out.println(genericBinarySearch.binarySearch(array,9));
        GenericBinarySearch<Character> characterGenericBinarySearch = new GenericBinarySearch<>();
        System.out.println(characterGenericBinarySearch.binarySearch(charArray, 'f'));
    }

}
