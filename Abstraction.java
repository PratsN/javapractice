abstract class Abstraction {
    abstract void start();
}

class Car extends Abstraction {
    void start() {
        System.out.println("I am child a Car");
    }
}

class Animal extends Abstraction {
    void start() {
        System.out.println("I am child an Animal");
    }

    public static void main(String args[]) {
        Car honda = new Car();
        honda.start();
        Animal dog = new Animal();
        dog.start();
    }
}