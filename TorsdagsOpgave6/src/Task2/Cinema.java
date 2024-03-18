package Task2;

public class Cinema {
    String[][] seats;


    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        for (int i = 0; i < this.seats.length; i++) {
            for (int j = 0; j < this.seats[i].length; j++) {
                this.seats[i][j] = "O";
            }
        }
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int rows, int seat) {
        if (seats[rows-1][seat-1].equals("O")) {
            seats[rows-1][seat-1] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int rows, int seat) {
        if (seats[rows-1][seat-1].equals("X")) {
            seats[rows-1][seat-1] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}