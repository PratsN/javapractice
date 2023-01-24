import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String args[]) throws ClassNotFoundException {
        try {
            // Creating stream to read the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\serialize.txt"));
            Student s = (Student) in.readObject();
            // printing the data of the serialized object
            System.out.println(s.id + " " + s.name);
            // closing the stream
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
