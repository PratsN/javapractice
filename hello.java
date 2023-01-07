class hello {
    static int b = 20; // declaration of static variable
    int c = 30; // declaration of instance variable

    void trial() {
        int d = 40;
        System.out.println(b + " " + d);
        ++b;
        ++d;
    }

    public static void main(String args[]) {
        int a = 10; // declaration of local variable
        hello ref = new hello();
        ref.trial();
        ref.trial();
        System.out.println(a); // call directly
        System.out.println(hello.b); // call with class name
        System.out.println(ref.c); // call with object name
    }
}
