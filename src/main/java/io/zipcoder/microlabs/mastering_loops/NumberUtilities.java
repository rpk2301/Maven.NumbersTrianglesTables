package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String ret = "";
        for(int i = start; i<stop; i++)
        {
            if(i%2==0)
            {
                ret = ret + i;
            }
        }
    return ret;
    }


    public static String getOddNumbers(int start, int stop)
    {
    String ret = "";
        for(int i = start; i<stop; i++)
    {
        if(i%2!=0)
        {
            ret = ret + i;
        }
    }
    return ret;
}

    public static String getSquareNumbers(int start, int stop, int step)
    {
        String ret = "";
        for(int i = start; i<stop; i+=step)
        {
            int var = i*i;
            ret+=var;
        }
    return ret;
    }






    public static String getRange(int start)
    {
        int end = start;
        String ret= "";
        for(int i = 0; i<start; i++)
        {
            ret = ret+i;
        }
        return ret;
    }

    public static String getRange(int start, int stop) {
        int sto = stop;
        int sta = start;
        String ret = "";
        for (int f =sta;f<sto;f++)
        {
            ret = ret + f;
        }

        return ret;
    }

    public static String getRange(int start, int stop, int step) {

        String ret = "";
        for(int i =start; i<stop; i+=step)
        {
            ret+=i;
        }
        return ret;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent)
    {
        String ret = "";
        for(int i=start;i<stop;i+=step)
        {
            int f = (int) Math.pow(i,exponent);
            ret+=f;
        }
        return ret;
    }
}
