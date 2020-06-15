package part11_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class KiemTraChuoiPalindrome {
    private static Stack<Character> addStack(String str) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++) {
            stack.push(str.charAt(i));
        }
        return stack;
    }
    private static Queue<Character> addQueue(String str) {
        Queue<Character> queue=new LinkedList<>();
        for(int i=0;i<str.length();i++) {
            queue.add(str.charAt(i));
        }
        return queue;
    }
    private static boolean compare(Stack<Character> stack, Queue<Character> queue) {
        while (!stack.empty()) {
            if(!stack.pop().equals(queue.remove())) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=scanner.nextLine();
        boolean isPalindrome=compare(addStack(str), addQueue(str));
        if(isPalindrome) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not is Palindrome");
        }
    }
}
