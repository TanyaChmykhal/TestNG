package com.example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsDependencies {

    @BeforeGroups("dpd")
    public void setUpDPD() {
        System.out.println("setUpDPD");
    }
    @BeforeGroups("lpd")
    public void setUpLPD() {
        System.out.println("setUpLPD");
    }
    @AfterGroups("dpd")
    public void deleteDPD() {
        System.out.println("deleteDPD");
    }
    @AfterGroups("lpd")
    public void deleteLPD() {
        System.out.println("deleteLPD");
    }

    @Test(groups = "dpd")
    public void doorbell_v4() {
        System.out.println("doorbell_v4");
    }
    @Test(groups = "lpd")
    public void hazelnut() {
        System.out.println("hazelnut");

    }
    @Test(groups = "dpd")
    public void doorbell_v3() {
        System.out.println("doorbell_v3");
    }
    @Test(groups = "lpd")
    public void stickup_cam_elite() {
        System.out.println("stickup_cam_elite");

    }
    @Test(dependsOnGroups = {"lpd", "dpd"})
    public void cocoa_camera() {
        System.out.println("cocoa_camera");

    }
    @Test(groups = "dpd")
    public void cocoa_doorbell() {
        System.out.println("cocoa_doorbell");

    }
}
