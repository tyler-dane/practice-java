package java_basics.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DemoArrays {

    /** array of ints */
    private void intArrayDemo() {
        int[] arr = { 7, 66, 9, 66, 8 };

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        arr[0] = -2; // update value by index

        // search and delete item matching '66'
        for (int j = 0; j < arr.length; j++) {
            System.out.println("checking " + arr[j]);
            if (arr[j] == 66) {

                // Create another array of size one less
                int[] arr2 = new int[arr.length -1];

                // Copy the elements except the 66 to new array
                for (int i = 0, k = 0; i < arr.length; i++) {
                    // if the index is the removal element index
                    if (i == j) {
                        continue; // skip
                    }
                    else {
                        // otherwise, copy following # to current # (thus decrementing by 1 total)
                        arr2[k++] = arr[i];
                    }
                }
                arr = arr2;
            }
        }

        System.out.println("Updated array: ");
        System.out.println(Arrays.toString(arr));
    }

    public void doArrayThings() {
        // ArrayList object
        ArrayList<String> strArr = new ArrayList<String>();
        HashMap<Integer, String> map = new HashMap<>();
    }

    public static void main(String[] args) {
        DemoArrays d = new DemoArrays();
        d.intArrayDemo();
    }
}
