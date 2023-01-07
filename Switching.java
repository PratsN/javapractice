import java.util.Scanner;

public class Switching {
    public static void main(String[] args) {
        int a = 10, b = 20, choice;
        System.out.print("Enter your choice:: ");

        Scanner ref = new Scanner(System.in);
        choice = ref.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Sum:: " + (a + b));
                break;
            case 2:
                System.out.print("Difference:: " + (a - b));
                break;
            case 3:
                System.out.print("Multiplication:: " + (a * b));
                break;
            default:
                System.out.print("Invalid Entry");
        }
    }
}
