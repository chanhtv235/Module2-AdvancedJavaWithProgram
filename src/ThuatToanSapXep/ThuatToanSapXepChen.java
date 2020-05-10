package ThuatToanSapXep;

import java.util.Scanner;

public class ThuatToanSapXepChen {
    private static void inputArray(int []arr, int numberOfArr) {
        Scanner scn =  new Scanner(System.in);
        for(int i=0; i<numberOfArr; i++) {
            System.out.print("A[ "+i+" ]: ");
            arr[i] = scn.nextInt();
        }
    }

    private static void outputArray(int []arr, int numberOfArr) {
        for(int i=0; i<numberOfArr; i++) {
            System.out.println("arr[ "+i+" ]: "+arr[i]);
        }
    }

    private static void insertionSort(int []arr, int n) {
        for(int i=1; i<n; i++) {
            int x = arr[i];
            int y = i;
            while( y > 0 && arr[ y - 1 ] > x ) {
                arr[y]=arr[y-1];
                y--;
            }
            arr[y]=x;
        }
    }

    public static void main(String[] args) {
        int []arr;
        int numberOfArray=0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập số: ");
        numberOfArray = scn.nextInt();
        arr = new int[numberOfArray];
        inputArray(arr, numberOfArray);
        outputArray(arr, numberOfArray);
        System.out.println("Mảng sau khi sắp xếp (Insertion Sort)");
        insertionSort(arr, numberOfArray);
        outputArray(arr, numberOfArray);
    }
}
