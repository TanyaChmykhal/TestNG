package com.example;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "ChimeDeviceInfo")
    public Object[][] getSearchData() {
        return new Object[][] {
                {"chime", "1"},
                {"chime_pro", "3"},
                {"gelato", "2"}
        };

    }
}
