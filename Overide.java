public class Overide {
    void add() {
        System.out.println("one");
    }

}

class Ride extends Overide {
    void add() {
        System.out.println("two");
    }

    public static void main(String args[]) {
        Overide obj = new Overide();
        obj.add();
        Ride ref = new Ride();
        ref.add();
    }
}
