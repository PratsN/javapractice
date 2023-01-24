public class Exception extends Throwable {
    public static void main(String args[]) {
        // try {
        // int divide = 4 / 0;
        // } catch (ArithmeticException e) {
        // System.out.println(e);
        // }
        // single catch block

        // catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("I am array index out of bound exception");
        // } catch (ArithmeticException e) {
        // System.out.println("I am arithmatic exception");
        // }
        // multiple catch block

        // finally {
        // System.out.println("I am executing finally");
        // }
        // finally block

        try {
            int num = 5 / 0;
            try {
                int arr[] = { 10, 20, 30, 40 };
                System.out.println(arr[1]);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("I am running");
    }
}
