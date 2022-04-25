package Test;

import Base.Setup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegTest extends Setup {

    @Test
    public void userSignup() throws InterruptedException {

        RegTest regTest = new RegTest(driver);

        driver.get("http://automationpractice.com/");
//        regTest.doSignup();

        String name = regTest.doSignup();
        Assert.assertTrue(regTest.logoutBtn.isDisplayed(), String.valueOf(true));
        Assert.assertEquals(name, "Nadim Mahmud");

        Thread.sleep(5000);
        regTest.logoutBtn.click();

    }

}
