class Hello {
    static int b = 20; // declaration and initialization of static variable
    int c = 30; // declaration of instance variable

    void variable() {
        int d = 40; // declaration of local variable
        System.out.println(b + " " + d);
        ++b;
        ++d;
    }

    public static void main(String[] args) {
        int a = 10; // declaration of local variable
        Hello ref = new Hello(); // declaration of object
        ref.variable();
        ref.variable();
        System.out.println(a); // call directly
        System.out.println(Hello.b); // call with class name
        System.out.println(ref.c); // call with object name
    }
}
