package com.nopcommerce.page.testsuite;

import com.nopcommerce.page.pages.TopMenu;
import com.nopcommerce.page.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenu topMenu = new TopMenu();


    @Test(groups = {"regression"})
    public void verifyPageNavigation() {
        topMenu.selectMenu("Computers");
        String expectedMessage = "Computers";
        String actualMessage = topMenu.verifyComputerText();
        Assert.assertEquals(actualMessage, expectedMessage, "Computers page not display");
    }

}
