package part5_access_modifier.thuchanh.static2;

public class A {
    private static int b=12;
    static {
       int c =10;
        int a =12;
        c=a=30;
        System.out.println(a);
        System.out.println(c);
        System.out.println("Khoi static duoc trieu hoi");
    }
    public static void main(String args[]) {
        System.out.println("Hello main");

    }
}
