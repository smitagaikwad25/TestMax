package com.birdgelab;

public class FindMaxNumber {

    public static Integer findMaxNumberFormGivenNumbers(Integer a, Integer b, Integer c) {
        Integer MaxNum = a;
        if (b.compareTo(MaxNum)>0)
            MaxNum = b;
        if (c.compareTo(MaxNum)>0)
                MaxNum = c;
        return MaxNum;
    }
}