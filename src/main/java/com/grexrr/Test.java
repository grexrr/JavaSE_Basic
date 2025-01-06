/**
 This is for JavaSE review
 @author GRexrr
 @version v1.0
 */

package com.grexrr;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*
        1. Source code ends with .java
        2. Source code has multiple class declaration
        3. Class could have main() method
        4. Only one public method in each class file with its name identical to the filename
        6. Each sentence ends with ;
        7. Execution: compile and run
        */

        List<Integer> intList = Arrays.asList(1, 2, 3);
        System.out.println(intList.toString());
        System.out.println("Hello World!");
        System.out.println(intList);
    }
}
