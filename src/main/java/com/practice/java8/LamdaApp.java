package com.practice.java8;

import com.practice.java8.interfaces.IOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LamdaApp {

    public void sort() {
        List<String> list = new ArrayList<>();
        list.add("ricardo");
        list.add("andres");
        list.add("juan");

       /* Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);
            }
        });*/

        Collections.sort(list, (String o1, String o2) -> o1.compareTo(o2));
        for (String element : list) {
            System.out.println(element);
        }
    }

    public void average(double n1, double n2) {

       /* Operation operation = new Operation() {

            @Override
            public double average (double n1, double n2) {
                return (n1+n2)/2;
            }
        };*/
    }

    public static void main(String[] args) {
        LamdaApp app = new LamdaApp();
        app.sort();
        IOperation operation = (n1, n2) -> {
            return (n1+n2)/2;
        };
        app.average(2,4);
        System.out.println(operation.average(2,4));
    }
}
