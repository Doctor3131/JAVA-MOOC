import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (smallest > table[i]) {
                index = i;
                smallest = table[i];
            }
        }
        return index;
    }

    public static int indexOfSmallest(int[] array) {
        return indexOfSmallestFrom(array, 0);
    } 



    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestCurrentIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smallestCurrentIndex);
            // System.out.println(smallestCurrentIndex + "{" + array[smallestCurrentIndex] + "}" + " swap " + i + "{" + array[i] + "}");
        }
    }
}
