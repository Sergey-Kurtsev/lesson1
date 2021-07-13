package SolarSystem;

public class Earth implements Planet {
    String name = "Earth";
    private float acceleration = 9.81f;

    public String getName() {
        return name;
    }

    @Override
    public float getAcceleration() {
        return acceleration;
    }
}
