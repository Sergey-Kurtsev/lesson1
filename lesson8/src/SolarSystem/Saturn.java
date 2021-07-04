package SolarSystem;

public class Saturn implements Planet {
    String name = "Saturn";
    private float acceleration = 10.44f;

    public String getName() {
        return name;
    }

    @Override
    public float getAcceleration() {
        return acceleration;
    }
}
