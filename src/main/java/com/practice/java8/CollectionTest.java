package com.practice.java8;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

    private static List<String> list = new ArrayList<>() ;

    public static void  fullFill() {
        list.add("Ricardo");
        list.add("Andres");
        list.add("Jaime");
    }

    public static void forEachMethod() {
        list.forEach(System.out::println);
        System.out.println("---data---");
    }
    public static void removeIfMethod () {
         /*Iterator<String> it = list.iterator();
		while(it.hasNext()){
			if(it.next().equalsIgnoreCase("Ricardo")){
				it.remove();
			}
		}*/
        list.removeIf(name -> name.equals("Ricardo"));
        forEachMethod();
    }
    public static void sortMethod() {
        list.sort(String::compareToIgnoreCase);
        forEachMethod();
    }

    public static void main(String[] args) {
        fullFill();
        forEachMethod();
        sortMethod();
        removeIfMethod();
    }

}