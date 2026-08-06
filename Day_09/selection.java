//selection sort
class selection {
    public static void main(String[] args) {

        int arr[] = {105, 120, 10, 200, 20};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // Print the sorted array
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}