package Test;

import Base.Setup;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Setup {

    @Test
    public void userLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("http://automationpractice.com/");
        String name = loginPage.doLogin();
        Assert.assertTrue(loginPage.logoutBtn.isDisplayed(), String.valueOf(true));
        Assert.assertEquals(name, "Salman Rahman");

        Thread.sleep(5000);
        loginPage.logoutBtn.click();
    }

}
