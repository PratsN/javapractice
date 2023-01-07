import java.util.Scanner;

class If_else {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter number :: ");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        if (num < 0) {
            System.out.println("Negative Number");
        } else if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd  Number");
        }
    }
}