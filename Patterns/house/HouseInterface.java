package house;

public interface HouseInterface {
    House build();
    HouseBuilder setFloors(int floors);
    HouseBuilder setSquare(int square);
}
