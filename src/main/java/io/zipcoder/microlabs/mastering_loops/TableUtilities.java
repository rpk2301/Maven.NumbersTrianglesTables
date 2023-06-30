package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {


        String mult = getMultiplicationTable(5);
        return mult;

    }
    public static String getLargeMultiplicationTable() {

        String mult = getMultiplicationTable(10);
        return mult;


    }

    public static String getMultiplicationTable(int tableSize) {

        //ricky make a string builder

        String finalq = "";
        StringBuilder str1 = new StringBuilder("");
        {
            for (int i = 1; i <= tableSize; i++) {

                for (int o = 1; o <= tableSize; o++) {
                    int num = i * o;

                    if (num < 10) {
                        str1.append("  ");
                        str1.append(num);
                        str1.append(" |");
                    } else if (num > 9 && num <= 99) {
                        str1.append(" ");
                        str1.append(num);
                        str1.append(" |");
                    } else {


                        str1.append(num);
                        str1.append(" ");
                        str1.append("|");
                    }
                    if (o == tableSize) {
                        str1.append('\n');
                    }
                    finalq = str1.toString();
                }


            }


        }
        return finalq;
    }
}
