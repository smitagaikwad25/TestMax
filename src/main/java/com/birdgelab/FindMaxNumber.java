package com.birdgelab;

public class FindMaxNumber<E extends Comparable> {
    E myAValue;
    E myBValue;
    E myCValue;

    public FindMaxNumber(E myAValue, E myBValue, E myCValue) {
        this.myAValue = myAValue;
        this.myBValue = myBValue;
        this.myCValue = myCValue;
    }

    public FindMaxNumber() {

    }

    public E testMaximum () {
        return testMaximum(myAValue,myBValue,myCValue);
    }

    public static <E extends Comparable > E testMaximum(E a, E b, E c)  {
        E MaxNum = a;
        if (b.compareTo(MaxNum)>0)
            MaxNum = b;
        if (c.compareTo(MaxNum)>0)
                MaxNum = c;
        return MaxNum;
    }


}