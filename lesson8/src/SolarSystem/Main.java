package SolarSystem;

public class Main {
    public static void main(String[] args) {
        Earth earth = new Earth();
        earth.printAcceleration();
        Mars mars = new Mars();
        mars.printAcceleration();
        Saturn saturn = new Saturn();
        saturn.printAcceleration();
        Venera venera = new Venera();
        venera.printAcceleration();
    }

}
