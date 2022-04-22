package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    @FindBy(className = "login")
    WebElement loginBtn;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "SubmitLogin")
    WebElement submitBtn;

    @FindBy(className = "logout")
    public WebElement logoutBtn;

    @FindBy(className = "header_user_info")
    List<WebElement> lusername;

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String doLogin() {
        loginBtn.click();
        email.sendKeys("salman@test.com");
        password.sendKeys("P@ssword123");
        submitBtn.click();
        return lusername.get(0).getText();
    }

}
