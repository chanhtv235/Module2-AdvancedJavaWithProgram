package demoEpKieu;

public class CustomerChild extends Customer {
    int age;

    public CustomerChild() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerChild{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
