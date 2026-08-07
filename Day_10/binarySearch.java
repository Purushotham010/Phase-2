import java.util.Arrays;

class binarySearch {
    public static void main(String[] args) {

        int[] arr = {3, 60, 35, 2, 45, 320, 5};
        int key = 2;

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                result = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}