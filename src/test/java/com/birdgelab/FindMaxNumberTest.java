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
        int maxNumberFormGivenNumbers = maxNumber.testMaximum(a,b,c);
        Assert.assertEquals(30,maxNumberFormGivenNumbers);
    }

    @Test
    public void givenMaxNum_WhenAtSecondPostion_RetunMaxNum_() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Integer a = 20;
        Integer b = 30;
        Integer c = 10;
        int maxNumberFormGivenNumbers = maxNumber.testMaximum(a,b,c);
        Assert.assertEquals(30,maxNumberFormGivenNumbers);
    }

    @Test
    public void givenMaxNum_WhenAtThirdPostion_RetunMaxNum_() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Integer a = 20;
        Integer b = 10;
        Integer c = 30;
        int maxNumberFormGivenNumbers = maxNumber.testMaximum(a,b,c);
        Assert.assertEquals(30,maxNumberFormGivenNumbers);
    }

    @Test
    public void givenFloatMaxNum_WhenAtFirstPostion_RetunFloatMaxNum_() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Float a = 30.0f;
        Float b = 20.0f;
        Float c = 10.0f;
        Float maxNumberFormGivenFloatNumber = maxNumber.testMaximum(a,b,c);
        Assert.assertEquals(30.0,maxNumberFormGivenFloatNumber,0.0);
    }

    @Test
    public void givenFloatMaxNum_WhenAtSecondPostion_RetunFloatMaxNum_() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Float a = 20.0f;
        Float b = 30.0f;
        Float c = 10.0f;
        Float maxNumberFormGivenFloatNumber = maxNumber.testMaximum(a,b,c);
        Assert.assertEquals(30.0,maxNumberFormGivenFloatNumber,0.0);
    }

    @Test
    public void givenFloatMaxNum_WhenAtThirdPostion_RetunFloatMaxNum_() {
        FindMaxNumber maxNumber = new FindMaxNumber();
        Float a = 10.0f;
        Float b = 20.0f;
        Float c = 30.0f;
        Float maxNumberFormGivenFloatNumber = maxNumber.testMaximum(a,b,c);
        Assert.assertEquals(30.0,maxNumberFormGivenFloatNumber,0.0);
    }

    @Test
    public void givenaMaxStringValue_WhenAtFirstPostion_RetunMaxValuString_() {
        FindMaxNumber MaxValueOfString = new FindMaxNumber();
        String a = "Peach";
        String b = "Apple";
        String c = "Banana";
        String maxValuOfStringFormGivenStrings = MaxValueOfString.testMaximum(a, b, c);
        Assert.assertEquals("Peach",maxValuOfStringFormGivenStrings);
    }

    @Test
    public void givenMaxStringValue_WhenAtSecondPostion_RetunMaxValuString_() {
        FindMaxNumber MaxValueOfString = new FindMaxNumber();
        String a = "Apple";
        String b = "Peach";
        String c = "Banana";
        String maxValuOfStringFormGivenStrings = MaxValueOfString.testMaximum(a, b, c);
        Assert.assertEquals("Peach",maxValuOfStringFormGivenStrings);
    }

    @Test
    public void givenMaxStringValue_WhenAtThirdPostion_RetunMaxValuString_() {
        FindMaxNumber MaxValueOfString = new FindMaxNumber();
        String a = "Apple";
        String b = "Banana";
        String c = "Peach";
        String maxValuOfStringFormGivenStrings = MaxValueOfString.testMaximum(a, b, c);
        Assert.assertEquals("Peach",maxValuOfStringFormGivenStrings);
    }

    @Test
    public void givenMaxIntegerNum_() {
        Integer a = 20;
        Integer b = 30;
        Integer c = 10;
        FindMaxNumber<Comparable> comparableFindMaxNumber = new FindMaxNumber<>(a,b,c);
        Comparable comparable = comparableFindMaxNumber.testMaximum();
        Assert.assertEquals(30,comparable);
    }

    @Test
    public void givenMaxNum_WhenAtFirstPosition_ShouldRetunMaxNumByUsingGenericClass() {
        Integer a = 30;
        Integer b = 20;
        Integer c = 10;
        FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals(30,comparable);
    }

    @Test
    public void givenMaxNum_WhenAtSecondPosition_ShouldRetunMaxNumByUsingGenericClass() {
        Integer a = 20;
        Integer b = 30;
        Integer c = 10;
        FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals(30,comparable);
    }

    @Test
    public void givenMaxNum_WhenAtThirdPosition_ShouldRetunMaxNumByUsingGenericClass() {
        Integer a = 20;
        Integer b = 10;
        Integer c = 30;
        FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals(30,comparable);
    }

    @Test
    public void givenFloatMaxNum_WhenAtFirstPosition_ShouldRetunMaxNumByUsingGenericClass() {
        Float a = 30.0f;
        Float b = 20.0f;
        Float c = 10.0f;
        FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals(30.0f,comparable);
    }

    @Test
    public void givenFloatMaxNum_WhenAtSecondPosition_ShouldRetunMaxNumByUsingGenericClass() {
        Float a = 20.0f;
        Float b = 30.0f;
        Float c = 10.0f;
        FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals(30.0f,comparable);
    }

    @Test
    public void givenFloatMaxNum_WhenAtThirdPosition_ShouldRetunMaxNumByUsingGenericClass() {
        Float a = 10.0f;
        Float b = 20.0f;
        Float c = 30.0f;
        FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals(30.0f,comparable);
    }

    @Test
    public void givenStringMaxValue_WhenAtFirstPosition_ShouldRetunMaxNumByUsingGenericClass() {
        String a = "Peach";
        String b = "Apple";
        String c = "Banana";
        FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals("Peach",comparable);
    }

    @Test
    public void givenStringMaxValue_WhenAtSecondPosition_ShouldRetunMaxNumByUsingGenericClass() {
        String a = "Apple";
        String b = "Peach";
        String c = "Banana";
        FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals("Peach",comparable);
    }

    @Test
    public void givenStringMaxValue_WhenAtThirdPosition_ShouldRetunMaxNumByUsingGenericClass() {
        String a = "Banana";
        String b = "Apple";
        String c = "Peach";
         FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals("Peach",comparable);
    }

    @Test
    public void givenMultipleValues_ShouldRetunMaxNumByUsingGenericClass() {
        Integer a = 20;
        Integer b = 30;
        Integer c = 10;
        Integer d = 40;
        FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c, d);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals(40,comparable);
    }

    @Test
    public void givenFloatMultipleValues_ShouldRetunMaxNumByUsingGenericClass() {
        Float a = 30.0f;
        Float b = 20.0f;
        Float c = 10.0f;
        Float d = 40.0f;
        FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c, d);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals(40.0f,comparable);
    }

    @Test
    public void givenStringMaxValue_ShouldRetunMaxNumByUsingGenericClass() {
        String a = "Banana";
        String b = "Apple";
        String c = "Peach";
        String d = "Orange";
        FindMaxNumber<Comparable> findMaxNumber = new FindMaxNumber<>(a, b, c, d);
        Comparable comparable = findMaxNumber.testMaximum();
        Assert.assertEquals("Peach",comparable);
    }

}
