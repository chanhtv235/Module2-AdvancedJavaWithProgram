package part11_stack_queue.demerging;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so luong nhan vien : ");
        int count=scanner.nextInt();
        scanner.nextLine();
        LinkedList<Employee> listEmployee=new LinkedList<Employee>();
        for (int i=0;i<count;i++){
            System.out.println("nhap ten nhan vien thu "+(i+1)+":");
            String name=scanner.nextLine();
            System.out.println("nhap gioi tinh nhan vien thu "+(i+1)+":");
            String gender=scanner.nextLine();
            System.out.println("nhap ngay thang nam sinh nhan vien thu (dd/mm/yyyy) "+(i+1)+":");
            String birthdayStr=scanner.nextLine();
            SimpleDateFormat format =new SimpleDateFormat("dd/MM/yyyy");
            Date birthday = format.parse(birthdayStr);
            Employee employee=new Employee(name,birthday,gender);
            listEmployee.add(employee);
        }
        for (int i=0;i<count;i++){
            System.out.print("thong tin hoc vien thu "+(i+1)+":");
            listEmployee.get(i).showInfo();
        }

        sortList(listEmployee);

        System.out.println("======== thông tin sau sắp xếp");
        for (int i=0;i<listEmployee.size();i++){
            System.out.print("thong tin hoc vien thu "+(i+1)+":");
            listEmployee.get(i).showInfo();
        }
        Queue<Employee> nu=new LinkedList<Employee>();
        for (int i=0;i<listEmployee.size();i++){
            if (listEmployee.get(i).getGender().equals("nu")){
                nu.add(listEmployee.get(i));
            }
        }
        Queue<Employee> nam=new LinkedList<Employee>();
        for (int i=0;i<listEmployee.size();i++){
            if(listEmployee.get(i).getGender().equals("nam")){
                nam.add(listEmployee.get(i));
            }
        }

        LinkedList<Employee> hoanThanh=new LinkedList<Employee>();
        while (!nu.isEmpty()){
            hoanThanh.add(nu.poll());
        }
        while (!nam.isEmpty()){
            hoanThanh.add(nam.poll());
        }
        System.out.println("sau khi tach nam va nu: ");
        for (Employee personnel : hoanThanh) personnel.showInfo();
    }

    public static void sortList(LinkedList<Employee> listEmployee ){
        Collections.sort(listEmployee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o2.getBirthday().compareTo(o1.getBirthday())>0){
                    return 1;
                }else if (o2.getBirthday().compareTo(o1.getBirthday())<0){
                    return -1;
                }else {
                    return (o2.getName().compareTo(o1.getName()));
                }

            }
        });
    }

}
