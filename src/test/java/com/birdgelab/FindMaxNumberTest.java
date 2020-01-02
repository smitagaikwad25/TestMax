package com.birdgelab;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

    @Test
    public void givenMaxNum_WhenAtFirstPosition_ShouldRetunMaxNum() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Integer a = 30;
        Integer b = 20;
        Integer c = 10;
        int maxNumberFormGivenNumbers = maxNumber.findMaxNumberFormGivenNumbers(a,b,c);
        Assert.assertEquals(30,maxNumberFormGivenNumbers);
    }

    @Test
    public void givenMaxNum_WhenAtSecondPostion_RetunMaxNum_() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Integer a = 20;
        Integer b = 30;
        Integer c = 10;
        int maxNumberFormGivenNumbers = maxNumber.findMaxNumberFormGivenNumbers(a,b,c);
        Assert.assertEquals(30,maxNumberFormGivenNumbers);
    }

    @Test
    public void givenMaxNum_WhenAtThirdPostion_RetunMaxNum_() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Integer a = 20;
        Integer b = 10;
        Integer c = 30;
        int maxNumberFormGivenNumbers = maxNumber.findMaxNumberFormGivenNumbers(a,b,c);
        Assert.assertEquals(30,maxNumberFormGivenNumbers);
    }

    @Test
    public void givenFloatMaxNum_WhenAtFirstPostion_RetunFloatMaxNum_() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Float a = 30.0f;
        Float b = 20.0f;
        Float c = 10.0f;
        Float maxNumberFormGivenFloatNumber = maxNumber.findMaxNumberFormGivenFloatNumber(a,b,c);
        Assert.assertEquals(30.0,maxNumberFormGivenFloatNumber,0.0);
    }

    @Test
    public void givenFloatMaxNum_WhenAtSecondPostion_RetunFloatMaxNum_() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Float a = 20.0f;
        Float b = 30.0f;
        Float c = 10.0f;
        Float maxNumberFormGivenFloatNumber = maxNumber.findMaxNumberFormGivenFloatNumber(a,b,c);
        Assert.assertEquals(30.0,maxNumberFormGivenFloatNumber,0.0);
    }

    @Test
    public void givenFloatMaxNum_WhenAtThirdPostion_RetunFloatMaxNum_() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Float a = 10.0f;
        Float b = 20.0f;
        Float c = 30.0f;
        Float maxNumberFormGivenFloatNumber = maxNumber.findMaxNumberFormGivenFloatNumber(a,b,c);
        Assert.assertEquals(30.0,maxNumberFormGivenFloatNumber,0.0);
    }

    @Test
    public void givenStringValue_WhenAtFirstPostion_RetunMaxValuString_() {
        FindMaxNumber MaxValueOfString = new FindMaxNumber();
        String a = "Peach";
        String b = "Apple";
        String c = "Banana";
        String maxValuOfStringFormGivenStrings = MaxValueOfString.FindMaxValuOfStringFormGivenStrings(a, b, c);
        Assert.assertEquals("Peach",maxValuOfStringFormGivenStrings);
    }

    @Test
    public void givenStringValue_WhenAtSecondPostion_RetunMaxValuString_() {
        FindMaxNumber MaxValueOfString = new FindMaxNumber();
        String a = "Apple";
        String b = "Peach";
        String c = "Banana";
        String maxValuOfStringFormGivenStrings = MaxValueOfString.FindMaxValuOfStringFormGivenStrings(a, b, c);
        Assert.assertEquals("Peach",maxValuOfStringFormGivenStrings);
    }

    @Test
    public void givenStringValue_WhenAtThirdPostion_RetunMaxValuString_() {
        FindMaxNumber MaxValueOfString = new FindMaxNumber();
        String a = "Apple";
        String b = "Banana";
        String c = "Peach";
        String maxValuOfStringFormGivenStrings = MaxValueOfString.FindMaxValuOfStringFormGivenStrings(a, b, c);
        Assert.assertEquals("Peach",maxValuOfStringFormGivenStrings);
    }

}
