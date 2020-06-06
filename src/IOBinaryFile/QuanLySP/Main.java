package IOBinaryFile.QuanLySP;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Menu\n" +
                "1. Add\n" +
                "2.display");
        Scanner input =new Scanner(System.in);
        int choose = input.nextInt();
        switch (choose){
            case 1: addNewProduct();
                     break;
            case 2: displayProduct();
        }
    }
    public static void addNewProduct(){
        Product product = new Product("001","samsung","VietNam", 20,"Chính hãng");
        Product product2 = new Product("002","samsung","VietNam", 20,"Chính hãng");
        Product product3 = new Product("002","samsung","VietNam", 20,"Chính hãng");
        ArrayList<Product> products =new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);
        File file = new File("Products.dat");
        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    for (Product pro:products){
                        oos.writeObject(pro);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void displayProduct() throws IOException {
//        ArrayList<Product> products =new ArrayList<>();
//        try {
//            ois = new ObjectInputStream(new FileInputStream("E:\\CODEGYM DANANG\\Jame\\Modul2.AdvancedJavaWithProgram\\Products.dat"));
//            // read student
//            Product product = (Product) ois.readObject();
//            // show student
//            System.out.println("sản phẩm: "+product.toString());
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } finally {
//            ois.close();
//        }
//        boolean cont = true;
//        try {
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\CODEGYM DANANG\\Jame\\Modul2.AdvancedJavaWithProgram\\Products.dat"));
//            while(cont){
//                Product product=null;
//                try {
//                    product = (Product) ois.readObject();
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//                if(product != null)
//                    products.add(product);
//                else
//                    cont = false;
//            }
//
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        FileInputStream fis = new FileInputStream("E:\\\\CODEGYM DANANG\\\\Jame\\\\Modul2.AdvancedJavaWithProgram\\\\Products.dat");//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\CODEGYM DANANG\\Jame\\Modul2.AdvancedJavaWithProgram\\Products.dat"));

        ArrayList<Product> list = new ArrayList<>();
        boolean cont = true;
        ObjectInputStream input = new ObjectInputStream(fis);
        while (cont) {
            try {
                Product product = (Product) input.readObject();
                if (product != null) {
                    list.add(product);
                } else {
                    cont = false;
                }
            } catch (Exception e) {
                // System.out.println(e.printStackTrace());
            }
        }
        for (Product product:list){
            System.out.println(product.toString());
        }
    }
}
