package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] res = new int[length];
        for (int i = 1; i <= length; i++) {
            res[i-1] = i;
        }
        return res;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int res = 0;
        for (int i: arr) res += i;
        return res;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) return i;
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        // define the rea array size:
        int k = 0;
        for (int i : arr) {
            if (i > 0) k++;
        }
        int[] res = new int[k];

        // fill res array by positive numbers:
        k = 0;
        for (int j : arr) {
            if (j > 0) {
                res[k] = j;
                k++;
            }
        }
        return res;
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) continue;

            int item = arr[i];
            int j = i;
            while (j > 0) {
                int index_prev = j - 1;
                int item_prev = arr[index_prev];

                if (item < item_prev) {
                    arr[j] = item_prev;
                    arr[index_prev] = item;
                    j--;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static int[][] sortArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) continue;

            int arr_len = arr[i].length;
            int index_curr = i;

            while (index_curr > 0) {
                int index_prev = index_curr - 1;
                int item_prev = arr[index_prev].length;
                int[] curr_arr = arr[index_curr];

                if (arr_len < item_prev) {
                    arr[index_curr] = arr[index_prev];
                    arr[index_prev] = curr_arr;
                    index_curr--;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public static int[][] sortRaggedArray(int[][] arr) {
        arr = sortArray(arr);
        for (int[] i_arr: arr) {
            sortArray(i_arr);
        }
        return arr;
    }
}
