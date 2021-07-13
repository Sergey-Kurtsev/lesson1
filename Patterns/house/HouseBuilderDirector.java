package house;

public class HouseBuilderDirector {
    private HouseBuilder builder;

    public HouseBuilderDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House construct() {
        return builder.setFloors(3)
                .setSquare(100)
                .build();
    }
}
