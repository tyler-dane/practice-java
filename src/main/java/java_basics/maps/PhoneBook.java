package java_basics.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**  Prints number of person's name.
 *  Try this input:
 *  ----
 *  2
 *  uncle sam
 *  12345678
 *  tom
 *  87654321
 *  ---------
 *  then wait for Task :PhoneBook.main()
 *  then type 'uncle sam' or 'tom' and get their number back
 *
 *
 *  https://www.hackerrank.com/challenges/phone-book/problem
 * */
class PhoneBook {
    public static void main(String []argh)
    {
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (!phoneBook.containsKey(s)) {
                System.out.println("Not found");
            }
            else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
        }
    }
}
