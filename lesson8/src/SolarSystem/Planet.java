package SolarSystem;

public interface Planet {
    float getAcceleration();
    String getName();
    default void printAcceleration() {
        System.out.println("The acceleration of " + getName() + " is " + getAcceleration() + " m/s2");
    }
}