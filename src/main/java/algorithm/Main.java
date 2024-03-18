package algorithm;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4};
        int[] resultArray = calculateArrayProducts(inputArray);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println("arr[" + i + "] = " + resultArray[i]);
        }
    }

    public static int[] calculateArrayProducts(int[] arr) {
        int product = 1;
        for (int value : arr) {
            product *= value;
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = product / arr[i];
        }
        return result;
    }
}
