package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {



        {
            StringBuilder str1 = new StringBuilder("");

            String ret = "";
            for (int i = 1; i < numberOfRows; i++) {
                for (int f = 0; f < i; f++) {
                    str1.append("*");
                }
                str1.append('\n');
            }
            ret = str1.toString();
            return ret;
        }





















    }

    public static String getRow(int numberOfStars) {

        String ret = "";
        for (int i = 0; i < numberOfStars; i++) {
            ret += ("*");
        }
        return ret;
    }

    public static String getSmallTriangle() {
        StringBuilder str1 = new StringBuilder("");
        String ret = "";
        for (int i = 1; i < 5; i++) {
            for (int f = 0; f < i; f++) {
                str1.append("*");
            }
            str1.append('\n');
        }
        ret = str1.toString();
        return ret;
    }

    public static String getLargeTriangle() {
        StringBuilder str1 = new StringBuilder("");

        String ret = "";
        for (int i = 1; i < 10; i++) {
            for (int f = 0; f < i; f++) {
                str1.append("*");
            }
            str1.append('\n');
        }
        ret = str1.toString();
        return ret;
    }
}