import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 12, 5, 3, 12, 1, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j = i - 1;
            while ((j >= 0) && (x < array[j])) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}
