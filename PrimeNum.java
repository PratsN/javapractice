import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        int num;
        boolean flag = false;
        System.out.print("Enter Number :: ");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.print(num + " is a prime number");
        } else {
            System.out.print(num + " is not a prime number");
        }
    }

}
