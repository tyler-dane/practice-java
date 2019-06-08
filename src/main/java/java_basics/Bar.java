package java_basics;

import java.util.Scanner;


public class Bar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int i = sc.nextInt();
        System.out.println(i); // will print the variable
    }
}


//Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//}
