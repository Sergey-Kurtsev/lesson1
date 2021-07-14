package singletone;
// Паттерн синглтон, без идеи
public class Main {
    public static void main(String[] args) {
        Singletone.getInstance(5);
        Singletone.getInstance(2);
    }
}
