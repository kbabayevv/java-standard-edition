package generics;

public class CheckArray {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(compareArrays(arr1, arr2));
        String[] stringArray1 = {"apple", "banana", "cherry"};
        String[] stringArray2 = null;
        System.out.println(compareArrays(stringArray1, stringArray2));

    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        try {
            if (array1.length != array2.length) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
}

