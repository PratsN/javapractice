import java.util.Scanner;

class YoungAge extends RuntimeException {
    YoungAge(String msg) {
        super(msg);
    }
}

public class Throw {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = s.nextInt();
        try {
            if (age < 18) {
                throw new YoungAge("You are not eligible for voting");
            } else {
                System.out.println("You can Vote");
            }
        } catch (YoungAge e) {
            System.out.println(e);
        }
        System.out.println("I am end of programme");
    }
}
