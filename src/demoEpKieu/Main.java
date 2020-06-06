package demoEpKieu;

public class Main {
    public static void main(String[] args) {
        Customer customer =new CustomerChild();
        System.out.println(customer instanceof Customer);
        System.out.println(customer instanceof CustomerChild);
        CustomerChild customerChild =new CustomerChild();
        System.out.println(customerChild instanceof Customer);
        System.out.println(customerChild instanceof CustomerChild);
        customer.setName("codegym");
        customerChild.setName("chanh");
        customerChild.setAge(10);
        ((CustomerChild)customer).setAge(20);
       customerChild= (CustomerChild) customer;
        System.out.println(customer);
        System.out.println(customerChild);
    }


}
