package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
    SoftAssert softAssert = new SoftAssert();
    String actualValue="sashini";


    @Test(priority = 0)
    public void valuesEqualCheck(){
        String expectedValue="sashin";
        System.out.println("Prior to valuesEqualCheck assertion");
        softAssert.assertEquals(actualValue, expectedValue,"Values miss matched");
        System.out.println("After to valuesEqualCheck assertion");
        //If the method fails, you must call assertAll method it to see the exception.
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void valuesNotEqualCheck(){
        String expectedValue="manage";
        System.out.println("Prior to valuesNotEqualCheck assertion");
        softAssert.assertNotEquals(actualValue, expectedValue,"Values  matched");
        System.out.println("After to valuesNotEqualCheck assertion");

    }

    @Test(priority = 2)
    public void trueConditionCheck(){
        System.out.println("Prior to trueConditionCheck assertion");
        softAssert.assertTrue(actualValue.startsWith("s"),"Condition Return a False");
        System.out.println("After to trueConditionCheck assertion");

    }
    @Test(priority = 3)
    public void falseConditionCheck(){
        System.out.println("Prior to falseConditionCheck assertion");
        softAssert.assertFalse(actualValue.isBlank(),"Condition Return a True");
        System.out.println("After to falseConditionCheck assertion");


    }


}
