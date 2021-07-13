package house;

public class House {
    private int floors;
    private int square;

    public House() {
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getFloors() {
        return floors;
    }

    public int getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "The House has " + floors + ", a total square is " + square;
    }
}
//    public int getFloors(int floors) {
//        return floors;
//    }
//
//    public int getSquare(int square) {
//        return square;
//    }
//}
