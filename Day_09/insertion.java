//Insertion sort
class insertion {
    public static void main(String[] args) {

        int arr[] = {105, 120, 10, 200, 20};
        int n = arr.length;

        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;

            while ((i >= 0) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }

            arr[i + 1] = key;
        }

        // Print the sorted array
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}