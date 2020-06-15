package part14_sort_algorithm;

public class CaiDatThuatToanSapXepChen {
    /*Function to sort array using insertion sort*/
    static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position (di chuyển các phần tử phía trướ lớn hơn key về phái sau) */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;// đặt key vào lại vị trí mà key lớn hơn phần tử đang so sanh
        }
    }

    public static void main(String[] args) {
        int[] array ={1,22,3,-4,25,6,7};
        CaiDatThuatToanSapXepChen.sort(array);
        for (int num:array) {
            System.out.println(num);
        }
    }
}
