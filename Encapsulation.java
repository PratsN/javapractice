public class Encapsulation {
    private int id; // private method for encapsulation

    public void setId(int empId) { // set method
        id = empId;
    }

    public int getId() { // get method
        return id;
    }
}

class authorize {
    public static void main(String[] args) {
        Encapsulation ref = new Encapsulation();
        ref.setId(11);
        System.out.println("Output : " + ref.getId());
    }

}
