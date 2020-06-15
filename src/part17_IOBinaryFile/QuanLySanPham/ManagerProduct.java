package part17_IOBinaryFile.QuanLySanPham;

import java.io.*;
import java.util.Scanner;

public class ManagerProduct {
    public static void displayMenu() throws IOException {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Menu\n"+
                "1. add new product\n" +
                "2. display product");
        int choose = scanner.nextInt();
        switch (choose){
            case 1: addNewProduct();
            displayMenu();
                break;
            case 2 :displayProduct();
            displayMenu();
                break;
            default: displayMenu();
        }
    }
    public static void addNewProduct() throws IOException {
        System.out.println("Thêm mới sản phẩm");
        Scanner input =new Scanner(System.in);
        Product product =new Product();
        System.out.println("1.Nhập mã sản phẩm");
        product.setProductCode(input.nextLine());
        System.out.println("2.Nhập tên sản phẩm");
        product.setNameProduct(input.nextLine());
        System.out.println("3.Nhập tên nhà sản xuất");
        product.setProducer(input.nextLine());
        System.out.println("4.Nhập giá sản phẩm");
        product.setPrice(input.nextInt());
        System.out.println();
        System.out.println("5.Mô tả sản phẩm");
        Scanner input1 =new Scanner(System.in);
        product.setDesciption(input1.nextLine());
        String string = product.toString();
        string+="\n";
        String listProductString=string+getProductList();///lấy dữ liệu trong file ra và add dữ liệu mới
        File productFile= new File("E:\\CODEGYM DANANG\\Jame\\Modul2.AdvancedJavaWithProgram\\src\\IOBinaryFile\\QuanLySanPham\\productFile");
        OutputStream outputStream =null;
        byte stringByte[] = listProductString.getBytes();
        try {
            outputStream  =new FileOutputStream(productFile);
            outputStream.write(stringByte);
            outputStream.close();
            System.out.println("Ghi file đã thành công");
        }catch (IOException ex) {
            System.out.println("lỗi ghi file");
        }finally {
            outputStream.close();
        }
    }
    public static void displayProduct() throws IOException {
        System.out.println(getProductList());
    }
    public static String getProductList() throws IOException {
        File productFile= new File("E:\\CODEGYM DANANG\\Jame\\Modul2.AdvancedJavaWithProgram\\src\\IOBinaryFile\\QuanLySanPham\\productFile");
        InputStream inputStream =null;
        inputStream = new FileInputStream(productFile);
        String stringRead ="";
        try {
            inputStream = new FileInputStream(productFile);
            int i=0;
            while ((i = inputStream.read()) != -1) {
                stringRead+=(char)i;
            }
            inputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            inputStream.close();
        }
        return stringRead;
    }


}
