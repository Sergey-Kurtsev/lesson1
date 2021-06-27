import java.util.Arrays;

public class StringArray {
    String[] array;
    String fullString;

    public StringArray(String... array) { // Конструктор для первого задания
        this.array = array;
    }

    public String printArrayInString() { // Метод для третьего задания
        this.fullString = "1: " + this.array[0] + "; ";
        for (int i = 1; i < this.array.length; i++) {
            if (i < this.array.length - 1) { // Условие чтобы в последнем элементе не было точки с запятой
                this.fullString += i + 1 + ": " + this.array[i] + "; ";
            } else {
                this.fullString += i + 1 + ": " + this.array[i]; // Отсекаем точку с запятой в последнем элементе
            }
        }
        return this.fullString;
    }

    public static void main(String[] args) {
        StringArray test = new StringArray("Vasya", "Petya", "Kolya", "Anton", "Fedor", "Vadim");
        System.out.println(test.printArrayInString());
    }
}
