package testNG;

import org.testng.annotations.*;

public class AnnotationsHierarchy {
    @Test
    public void test01() {
        System.out.println("test01");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before Class");
    }
    @Test
    public void test02() {
        System.out.println("test02");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("after Class");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}

