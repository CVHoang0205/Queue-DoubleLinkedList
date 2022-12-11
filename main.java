
public class main {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            int Min = i;
            for (int j = i + 1; j < n; i++)
                if (arr[j] < arr[Min])
                    Min = j;
            int temp = arr[Min];
            arr[Min] = arr[i];
            arr[i] = temp;
            System.out.println("Min: " + arr[i]);
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.println(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int arr[] = {1, 6, 2, 4, 3, 5};
        ss.sort(arr);
        System.out.println("Sorted array");
        ss.printArray(arr);
    }
}
