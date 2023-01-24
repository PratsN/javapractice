public class Stat {
    Stat() {
        System.out.println("Constructor called");
    }

    static {
        System.out.println("I am static block 10");
    }

    static {
        System.out.println("I am static block 2");
    }

    public static void main(String[] args) {
        System.out.println("I am main method");
        Stat t1 = new Stat();

    }

}
