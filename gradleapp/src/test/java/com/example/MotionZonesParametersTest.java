package com.example;

import org.testng.annotations.*;

import java.lang.reflect.Method;

public class MotionZonesParametersTest {

    @BeforeClass
    public void turnOnRecordMotion() {
        System.out.println("turnOnRecordMotion");
    }

    @AfterClass
    public void deleteMotionZones() {
        System.out.println("deleteMotionZones");
    }

//`    @Test
//    @Parameters({"zones_number", "zones_name"})
//    public void motionZoneParameters(String zones_number, String zones_name) {
//        System.out.println("Motion Zone number " + zones_number);
//        System.out.println("Motion Zone name " + zones_name);
//    }

    @DataProvider(name = "DeviceInfo")
    public Object[][] getDeviceName() {
        return new Object[][]{
                {"doorbell_v4", "5"},
                {"scallop_lite", "1"},
                {"goldfish", "0"}
        };
    }
    @Test(dataProvider = "DeviceInfo")
    public void DeviceInfo (String query, String result) {
        System.out.println("Ring devices with device kind " + query + " are installed: " +result);
    }


    @Test(dataProvider = "ChimeDeviceInfo",dataProviderClass = TestData.class)
    public void ChimeDeviceInfo (String query, String result) {
        System.out.println("Chime devices with device kind " + query + " are installed: " +result);
    }

    @DataProvider(name = "DeviceInfo2")
    public Object[][] getDeviceName2(Method m) {
        if (m.getName() == "DeviceInfo") return new Object[][]{};
        return new Object[][]{
                {"unknown", "5"},
                {"new", "1"},
                {"null", "0"}
        };
    }
}