package collections.com;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        int num = 6;
        Integer myInteger = Integer.valueOf(num);
        System.out.println(myInteger);

        System.out.println( myInteger.getClass());

        ArrayList mylist = new ArrayList();

        mylist.add(1);
        System.out.println(mylist);
    }
}
