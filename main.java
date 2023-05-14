public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = { 64, 34, 25, 122, 22, 11, 90 };
        bubbleSort(arr);
        System.out.println("Array setelah diurutkan secara ascending:");
        printArray(arr);

        int[] arr2 = { 64, 34, 25, 122, 22, 11, 90 };
        insertionSort(arr2);
        System.out.println("Array setelah diurutkan secara ascending:");
        printArray(arr2);

        int[] arr3 = { 64, 34, 25, 122, 22, 11, 90 };
        selectionSort(arr3);
        System.out.println("Array setelah diurutkan secara ascending:");
        printArray(arr3);

        int[] arr4 = { 64, 34, 25, 122, 22, 11, 90 };
        insertionSort(arr4, "desc");
        System.out.println("Array setelah diurutkan secara descending:");
        printArray(arr4);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int arr[]) {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                }
            }
            temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr, String param) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            if (param.equals("asc")) {
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
            } else if (param.equals("desc")) {
                while (j >= 0 && arr[j] < key) {
                    arr[j +  1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
