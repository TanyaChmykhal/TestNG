/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInTests {

    @BeforeClass
    public void FreshInstallApp() {
        System.out.println("FreshInstallApp");
    }

    @AfterClass
    public void DeleteApp() {
        System.out.println("DeleteApp");
    }

    @Test(groups = "Smoke")
    public void LoginAsDeviceOwner() {
        System.out.println("LoginAsDeviceOwner");
    }

    @Test(groups = "Regression")
    public void LoginAsSharedUser() {
        System.out.println("LoginAsSharedUser");
    }

    @Test(groups = {"iOS", "Android"})
    public void LoginOnTablet() {
        System.out.println("LoginOnTablet");
    }
}
