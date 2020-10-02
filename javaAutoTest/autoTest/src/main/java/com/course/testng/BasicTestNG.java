package com.course.testng;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BasicTestNG {

    @Test(groups = "group1")
    public void test1(){
        System.out.println("group111的test111");
    }

    @Test(groups = "group1")
    public void test2(){
        System.out.println("group111的test222");
    }

    @Test(groups = "group2")
    public void test3(){
        System.out.println("group222的test3");
    }

    @BeforeGroups(groups = "group1")
    public void beforeTest(){
        System.out.println("group111的前置方法");
    }

    @AfterGroups(groups = "group1")
    public void afterTest() {
        System.out.println("group111的后置方法");
    }
}
