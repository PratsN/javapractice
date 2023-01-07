public class loops {
    public static void main(String args[]) {
        /* While loop */
        // int i = 1;
        // while (i <= 10) {
        // System.out.println("I am while Loop");
        // i++;
        // }

        /* For loop */
        // for (int i = 1; i <= 10; i++) {
        // System.out.println("I am FOR Loop " + i);
        // }

        /* For Each */

        int a[] = { 10, 20, 30, 40, 50 };
        for (int b : a) {
            System.out.println("I am FOREach Loop " + b);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("I am array element with for Loop " + a[i]);
        }

    }
}
