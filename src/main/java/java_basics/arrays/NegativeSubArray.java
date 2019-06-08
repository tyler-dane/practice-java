package java_basics.arrays;

import java.util.Scanner;

public class NegativeSubArray {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for( int i = 0; i < n; i++ ) {
            a[i] = scan.nextInt();
        }
        scan.close();

        int numNegativeSubarrays = 0;
        System.out.println(numNegativeSubarrays);
    }
}
