public class StringTest {
    public static void main(String args[]) {
        String str = "Pratiksha";
        System.out.println("Original" + str.hashCode());
        str = str.concat("Nagawade");
        String str2 = "Nagawade";
        System.out.println("Mutate" + str.hashCode());
        System.out.println(str2.hashCode());
    }
}