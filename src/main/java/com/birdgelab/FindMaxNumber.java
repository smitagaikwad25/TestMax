package com.birdgelab;

public class FindMaxNumber {

    public static <E extends Comparable > E findMaxValueFormGivenInputes (E a, E b, E c)  {
        E MaxNum = a;
        if (b.compareTo(MaxNum)>0)
            MaxNum = b;
        if (c.compareTo(MaxNum)>0)
                MaxNum = c;
        return MaxNum;
    }
}