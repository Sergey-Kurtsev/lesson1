package house;

public class HouseBuilder implements HouseInterface {

    private House houseTmp;

    public HouseBuilder() {
        houseTmp = new House();
    }

    @Override
    public House build() {
        House newBuilding = new House();
        newBuilding.setFloors(houseTmp.getFloors());
        newBuilding.setSquare((houseTmp.getSquare()));
        return newBuilding;
    }

    @Override
    public HouseBuilder setFloors(int floors) {
        houseTmp.setFloors(floors);
        return this;
    }

    @Override
    public HouseBuilder setSquare(int square) {
        houseTmp.setSquare(square);
        return this;
    }
}

