package part11_stack_queue.demerging;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Employee {
    private String name;
    private Date birthday;
    private String gender;

    public Employee() {
    }

    public Employee(String name, Date birthday, String gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void showInfo(){
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Name: "+ this.name+ ", Birthday: "+ this.birthday + ", Gender :" +this.gender);
    }
}
