package StackAndQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocCacPhanTuDungStack {
    static Scanner scanner = new Scanner(System.in);

    public static void reverseArray() {

        System.out.println("Nhập chiều dài của mảng");
       int length = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            System.out.print("Input element " + i + ": ");
            arr.add(scanner.nextInt());
        }
        Stack<Integer> stack = new Stack<>();
        for (Integer element : arr) {
            stack.push(element);
        }
        List<Integer> arrResule = new ArrayList<>();
        while (!stack.empty()) {
            arrResule.add(stack.pop());
        }
        System.out.println("Mảng ban đầu"+arr);
        System.out.println("Kết quả sau khi đảo"+arrResule);
    }

    public static void reveseString() {
        System.out.println("Nhập vào một dãy: ");
        String str = scanner.nextLine();
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            strings.push(String.valueOf(str.charAt(i)));
        }
        String result="";
        while (!strings.empty()) {
            result+=strings.pop();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        //Reverse Array use Stack
        reverseArray();
        System.out.print("\n");
        //Reverse String use Stack
       reveseString();

    }
}
