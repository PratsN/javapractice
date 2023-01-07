import java.util.Scanner;

class input_output {
    public static void main(String args[]) {
        int a;
        Scanner intObj = new Scanner(System.in);
        a = intObj.nextInt();
        System.out.print("Enter Integer Value:: ");
        System.out.println("Value :: " + a);
    }
}
