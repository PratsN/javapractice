public class Inheritance {
    float salary = 30000;
}

class Children extends Inheritance {
    int bonus = 5000;

    public static void main(String[] args) {
        Children ref = new Children();
        System.out.println("The salary of Employee is : " + ref.salary);
        System.out.println("The bonus of Employee is : " + ref.bonus);
        System.out.println("The Total payble to Employee is : " + (ref.bonus +
                ref.salary));
    }
}
