import java.util.Arrays;

public class Sorting {
    int[] array;

    Sorting(int... array) {
        this.array = array;
    }

    public void sortArray() {
        for (int i = 1; i < this.array.length; i++) {
            int element = this.array[i];
            int k = i;
            while (k > 0 && element < this.array[k - 1]) {
                this.array[k] = this.array[k - 1];
                k--;
            }
            this.array[k] = element;
        }
    }

    public void sortArrayReverse() {
        for (int i = 1; i < this.array.length; i++) {
            int element = this.array[i];
            int k = i;
            while (k > 0 && element > this.array[k - 1]) {
                this.array[k] = this.array[k - 1];
                k--;
            }
            this.array[k] = element;
        }
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting(5, 3, 2, 9, 7, 23);
        System.out.println(Arrays.toString(sorting.array));
        sorting.sortArray();
        System.out.println(Arrays.toString(sorting.array));
        sorting.sortArrayReverse();
        System.out.println(Arrays.toString(sorting.array));
    }
}
