package com.practice.java12;

public class SwitchExpression {

   public static void main (String ... args) {
        switchCase();
        System.out.println(getTextMultipleLabels(4));
    }

    private static void switchCase() {
        int day = 2;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        System.out.println(dayType); // Output: Weekday
    }

    private static String getTextMultipleLabels(int number) {
        String result = "";
        switch (number) {
            case 1, 2:
                result = "one or two";
                break;
            case 3:
                result = "three";
                break;
            case 4, 5, 6:
                result = "four or five or six";
                break;
            default:
                result = "unknown";
        };
        return result;
    }
}
