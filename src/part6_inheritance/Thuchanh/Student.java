package part6_inheritance.Thuchanh;

public class Student {
    int rollno;
    String name;
    String city;

    Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return rollno + " " + name + " " + city;
    }

    public static void main(String args[]) {
        Student s1 = new Student(101, "Viet", "HaNoi");
        Student s2 = new Student(102, "Nam", "DaNang");

        // trình biên dịch sẽ ghi s1.toString() thay vì s1
        // có nghĩa là khi khai báo s1 thì phương thức s1.toString()
        // được gọi
        System.out.println(s1);
        // trình biên dịch sẽ ghi s2.toString() thay vì s2
        System.out.println(s2);
    }
}
