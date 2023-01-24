import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class File {
    void FileRead() throws FileNotFoundException {
        FileInputStream finput = new FileInputStream("d:/abc.txt/");
    }

    void FileWrite() throws FileNotFoundException {
        String str = "I am string ";
        FileOutputStream fout = new FileOutputStream("d:/xyz.txt/");
    }
}

public class Throws {
    public static void main(String args[]) {
        File readwrite = new File();

        try {
            readwrite.FileRead();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("Exception handled successfuly");
    }

}
