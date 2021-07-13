package SolarSystem;

public class Venera implements Planet {
    String name = "Venera";
    float acceleration = 8.88f;

    public String getName() {
        return name;
    }

    @Override
    public float getAcceleration() {
        return acceleration;
    }
}
