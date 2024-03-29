import java.util.*;

class RadixSort {

    private int comparions;
    private int movements;

    public int get_max_val(int my_arr[], int arr_len) {
        int max_val = my_arr[0];
        for (int i = 1; i < arr_len; i++) {

            comparions += 1;
            if (my_arr[i] > max_val)
                max_val = my_arr[i];

        }
        return max_val;
    }

    public void countSort(int my_arr[], int arr_len, int exp) {
        int result[] = new int[arr_len];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < arr_len; i++)
            count[(my_arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = arr_len - 1; i >= 0; i--) {
            movements += 1;
            result[count[(my_arr[i] / exp) % 10] - 1] = my_arr[i];
            count[(my_arr[i] / exp) % 10]--;
        }

        for (i = 0; i < arr_len; i++) {

            movements += 1;
            my_arr[i] = result[i];

        }
    }

    public void radixsort(int my_arr[], int arr_len) {
        int m = get_max_val(my_arr, arr_len);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(my_arr, arr_len, exp);
    }

    public RadixSort() {}

    public int getComparisons() {

        return comparions;

    }

    public int getMovements() {

        return movements;

    }

}