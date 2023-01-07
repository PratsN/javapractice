import java.util.Scanner;

public class sumNum {
    public static void main(String args[]) {
        int num, result = 0;
        System.out.print("Enter number :: ");
        Scanner ref = new Scanner(System.in);
        num = ref.nextInt();

        for (int i = 1; i <= num; i++) {
            /* for sum of all numbers in given ange */
            // result += i;

            /* for sum of all even numbers */
            // if (i % 2 == 0) {
            // result += i;
            // }

            /* for sum of all odd numbers */
            if (i % 2 != 0) {
                result += i;
            }
        }
        System.out.println("Result of sum :: " + result);
    }

}
