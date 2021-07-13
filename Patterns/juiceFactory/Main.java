package juiceFactory;
//Паттерн фактори, производство соков
public class Main {
    public static void main(String[] args) {
        JuiceFactory juiceFactory = new JuiceFactory();
        Juice juice = juiceFactory.getJuice(JuiceTypes.MANGO);
        juice.drink();
    }
    }

