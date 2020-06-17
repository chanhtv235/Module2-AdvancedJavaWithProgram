package part12_java_collection_framework.binary_search_tree;

import java.util.Scanner;

public class TreeBinaryTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" nhập vào số lượng phần tử của Tree :");
        int size=input.nextInt();
        input.nextLine();
        TreeBinary treeBinary=new TreeBinary();
        for (int i=0;i<size;i++){
            System.out.println("Nhập vào số thứ"+(i+1)+":");
            treeBinary.insert(input.nextInt());
        }
        System.out.println("Hiện thị Tree binary: ");
        treeBinary.sort();
    }
}
