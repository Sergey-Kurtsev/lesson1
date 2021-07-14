package juiceFactory;

public class JuiceFactory {
    public Juice getJuice(JuiceTypes type) {
        Juice juice = null;
        switch (type) {
            case ORANGE:
                juice = new OrangeJuice();
                break;
            case APPLE:
                juice = new AppleJuice();
                break;
            case MANGO:
                juice = new MangoJuice();
                break;
            case TOMATO:
                juice = new TomatoJuice();
                break;
            default:
                System.out.println("We do no have such juice");

        }
        return juice;
    }
}
