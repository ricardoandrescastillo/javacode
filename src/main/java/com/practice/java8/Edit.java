package com.practice.java8;

public class Edit {

    public String getEditType(String data ){

        return data;
    }

    public static void main(String ... arg){
        String word ="bed";
        int posIni = 2;
        int posEnd = 2;
        String add = "ar";
        String str1 = word.substring(0, posEnd);
        String str2 = word.substring(posEnd,word.length());
        System.out.println(str1 + add + str2);

        posIni = 1;
        posEnd = 4;
        add = "";
        word = "replace";

        str1 = word.substring(0, posIni);
        str2 = word.substring(posEnd, word.length());

        System.out.println(str1 + add + str2);

        posIni = 0;
        posEnd = 1;
        add = "ing";
        word = "train";

        str2 = word.substring(posEnd, word.length());
        System.out.println(  add + str2);




    }
}
