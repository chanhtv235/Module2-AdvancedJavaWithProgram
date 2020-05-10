package IOTextFile.Copyfile;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
    public static void writeFile(FileWriter fw, String str) {
        try {
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }

    public static String readFile(FileReader fr) throws Exception {
        int i;
        String result="";
        while ((i = fr.read()) != -1) {
            result+=(char)i;
        }
        fr.close();
        return result;
    }

    public static void main(String[] args) throws Exception {
        String result=readFile(new FileReader("E:\\CODEGYM DANANG\\Jame\\Modul2.AdvancedJavaWithProgram\\src\\IOTextFile\\read.txt"));
        writeFile(new FileWriter("E:\\CODEGYM DANANG\\Jame\\Modul2.AdvancedJavaWithProgram\\src\\IOTextFile\\wirte.txt"),result);

    }
}
