package Test;

import Base.Setup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RegTest extends Setup {

    @Test
    public void userSignup() {

        RegTest regTest = new RegTest(driver);
        driver.get("http://automationpractice.com/");
        regTest.userSignup();

    }

}
