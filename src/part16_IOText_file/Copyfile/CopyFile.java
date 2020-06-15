package part16_IOText_file.Copyfile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void writeFile(File file, String str) throws IOException {
        FileWriter fw =new FileWriter(file);
        try {
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }

    public static String readFile(File file) throws Exception {
        FileReader fr =new FileReader(file);
        int i;
        String result="";
        while ((i = fr.read()) != -1) {
            result+=(char)i;
        }
        fr.close();
        return result;
    }

    public static void main(String[] args) throws Exception {

        File readFile =new File("E:\\CODEGYM DANANG\\Jame\\Modul2.AdvancedJavaWithProgram\\src\\IOTextFile\\Copyfile\\read.txt");
        File wirteFile =new File("E:\\CODEGYM DANANG\\Jame\\Modul2.AdvancedJavaWithProgram\\src\\IOTextFile\\Copyfile\\wirte.txt");
        String result=readFile(readFile);
        writeFile(wirteFile,result);

    }
}
