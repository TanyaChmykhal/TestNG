package com.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MethodsDependencies {

    @BeforeClass
    public void SetUpDevice() {
        System.out.println("SetUpDevice");
    }

    @AfterClass
    public void deleteDevice() {
        System.out.println("deleteDevice");
    }
    @Test
    public void turnOnMotionZones() {
        System.out.println("turnOnMotionZones");
    }
    @Test(dependsOnMethods = {"turnOnMotionZones"})
    public void getMotion() {
        System.out.println("getMotion");
    }
}
