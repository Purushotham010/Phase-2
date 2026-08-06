class shell {
    public static void main(String[] args) {

        int arr[] = {70, 30, 40, 10, 80, 20, 90, 110, 75, 60, 45};
        int gaps[] = {7, 3, 1};

        for (int gap : gaps) {
            for (int i = gap; i < arr.length; i++) {
                int key = arr[i];
                int j = i - gap;

                while (j >= 0 && arr[j] > key) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }

                arr[j + gap] = key;
            }
        }

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}