class Movie {
    int total_seats = 10;

    synchronized void seatBook(int seat) {
        if (total_seats >= seat) {
            System.out.println(seat + "seats booked sucessfully");
            total_seats = total_seats - seat;
            System.out.println("seat left :" + total_seats);
        } else {
            System.out.println("Sorry seat can't be booked");
            System.out.println("Seat left :" + total_seats);
        }
    }
}

class Synchronization extends Thread {
    static Movie b;
    int seat;

    public void run() {
        b.seatBook(seat);
    }

    public static void main(String args[]) {
        b = new Movie();
        Synchronization bollywood = new Synchronization();
        bollywood.seat = 7;
        bollywood.start();

        Synchronization hollywood = new Synchronization();
        hollywood.seat = 7;
        hollywood.start();
    }

}
