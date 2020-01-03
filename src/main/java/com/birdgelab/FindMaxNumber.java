package com.birdgelab;

import java.util.Arrays;

public class FindMaxNumber<E extends Comparable> {
    E [] myValue;

    public FindMaxNumber(E... myValue) {
        this.myValue = myValue;
    }

    public FindMaxNumber() {

    }

    public E testMaximum () {
        return testMaximum(myValue);
    }

    public static <E extends Comparable > E testMaximum(E... myValue)  {
        Arrays.sort(myValue);
        pritMax(myValue[myValue.length-1]);
        return (myValue[myValue.length-1]);
    }

    private static <E extends Comparable> void pritMax(E MaxmumValues) {
        System.out.println(" Maximum value " + MaxmumValues);
    }

}