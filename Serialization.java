
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String args[]) throws IOException {
        try {
            // Creating the object
            Student s1 = new Student(211, "ravi");
            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("D:\serialize.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            // closing the stream
            out.close();
            System.out.println("success");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
