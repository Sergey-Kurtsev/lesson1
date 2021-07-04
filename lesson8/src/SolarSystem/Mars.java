package SolarSystem;

public class Mars implements Planet {
    String name = "Mars";
    float acceleration = 3.86f;

    public String getName() {
        return name;
    }

    @Override
    public float getAcceleration() {
        return acceleration;
    }
}
