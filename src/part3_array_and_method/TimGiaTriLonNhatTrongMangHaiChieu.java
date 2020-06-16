package part3_array_and_method;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][]array=new int[3][3];
        int row=array.length;
        int col=array[0].length;
        Scanner input=new Scanner(System.in);
        for (int i=0;i<row;i++){
            for (int k=0;k<col;k++){
                System.out.printf("Element array[%d][%d]",i,k);
                array[i][k]=input.nextInt();
            }
        }
        int max=0;
        for (int i=0;i<row;i++){
            for (int k=0;k<col;k++){
                if (max<array[i][k]){
                    max=array[i][k];
                }
            }
        }
        System.out.printf("Max =%d",max);
    }
}
