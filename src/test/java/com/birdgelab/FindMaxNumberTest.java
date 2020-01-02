package com.birdgelab;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {
    @Test
    public void givenThreeNum_ShouldRetunMaxNum() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Integer a=30;
        Integer b=20;
        Integer c=10;
        int maxNumberFormGivenNumbers = maxNumber.findMaxNumberFormGivenNumbers(a,b,c);
        Assert.assertEquals(30,maxNumberFormGivenNumbers);
    }
}
