package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenTuThapPhanSangNhiPhan {
    public static String convertDecimalToBinary(int number) {
        Stack<Integer> stack=new Stack<>();
        String str="";
        int result=0;
        while (number!=0) {
            result=number%2;
            stack.push(result);
            number=number/2;
        }
        while (!stack.empty()) {
            str+=stack.pop();
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number =input.nextInt();
        System.out.println("Result: "+ convertDecimalToBinary(number));
    }
}
