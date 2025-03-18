import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("file1.txt");
        String s = "LMAO";
        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            fw.write(ch);
        }
        fw.close();

        FileReader fr = new FileReader("file1.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();

    }
}

