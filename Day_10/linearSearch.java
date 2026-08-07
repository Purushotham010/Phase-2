import java.util.Arrays;

class linearSearch {
    public static void main(String[] args) {

        int[] arr = {3, 60, 35, 2, 45, 320, 5};
        int key = 35;

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                result = i;
                break;
            }
        }

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}