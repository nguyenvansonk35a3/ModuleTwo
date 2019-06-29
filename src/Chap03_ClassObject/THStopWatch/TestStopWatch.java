package Chap03_ClassObject.THStopWatch;

public class TestStopWatch {

    public static void main(String[] args) {
        int[] numbers = new int[100000];
        StopWatch st = new StopWatch();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10000); // generate a random number
        }
        Print(numbers);
        selectionSort(numbers, 1000);
        System.out.println("\nSắp xếp: ");
        Print(numbers);
        st.setEndTime(System.currentTimeMillis());
        System.out.println("\nThời gian thực hiện selectionSort là " + st.getElapsedTime());
    }

    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
