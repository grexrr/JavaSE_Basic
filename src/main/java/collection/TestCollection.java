/*
Java Collection is the root interface of all collection framework, the one-stop solution for all data manipulation jobs
such as storing,searching, sorting, insertion, deletion and update of data. Java collection responds as asingle object,
 and a Java Collection Framework provides various interfaces and classes.
*/

package collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        /*
        Array (fixed length, required size when initiating)
        ArrayList (dynamic, size changes accordingly)
        */
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        System.out.println(c1.size());
        System.out.println(c1.stream().iterator().next());
        System.out.println((int)(5/2));
    }
}
