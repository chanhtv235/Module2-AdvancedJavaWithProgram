package part11_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static boolean kiemTra(String str) {
        Stack<Character> stack = new Stack<>();
        boolean check =false;
        for (int i = 0; i < str.length(); i++) {
            char c =(str.charAt(i));
            if ('('==c) {
                stack.push((str.charAt(i)));
            } else if (')'==(str.charAt(i))) {
                 if((stack.pop()!=(')'))) {
                    check =true;
                     stack.push((str.charAt(i)));
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        boolean isKiemTra = kiemTra(str);
        if (isKiemTra) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}
