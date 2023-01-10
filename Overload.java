class Overload {
    void sum(int a) {
        System.out.print(a);
    }

    void sum(int a, int b) {
        System.out.print(a + b);
    }

    public static void main(String[] args) {
        Overload ref = new Overload();
        ref.sum(6, 80);
    }

}
