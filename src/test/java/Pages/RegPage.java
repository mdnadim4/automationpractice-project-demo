package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegPage {

    @FindBy(className = "login") WebElement loginBtn;
    @FindBy(id = "email_create") WebElement emailAddress;
    @FindBy(id = "SubmitCreate") WebElement createBtn;
    @FindBy(id = "id_gender1") WebElement genderTitle;
    @FindBy(id = "customer_firstname") WebElement firstName;
    @FindBy(id = "customer_lastname") WebElement lastName;
    @FindBy(id = "passwd") WebElement password;
    @FindBy(id = "days") WebElement days;
    @FindBy(id = "months") WebElement months;
    @FindBy(id = "years") WebElement years;
    @FindBy(id = "newsletter") WebElement newsletter;
    @FindBy(id = "optin") WebElement offer;
    @FindBy(id = "firstname") WebElement firstName2;
    @FindBy(id = "lastname") WebElement lastName2;
    @FindBy(id = "company") WebElement company;
    @FindBy(id = "address1") WebElement address;
    @FindBy(id = "city") WebElement city;
    @FindBy(id = "id_state") WebElement state;
    @FindBy(id = "postcode") WebElement postcode;
    @FindBy(id = "id_country") WebElement country;
    @FindBy(id = "other") WebElement information;
    @FindBy(id = "phone") WebElement homePhone;
    @FindBy(id = "phone_mobile") WebElement mobilePhone;
    @FindBy(id = "alias") WebElement refAddress;
    @FindBy(id = "submitAccount") WebElement submitBtn;
    WebDriver driver;

    public RegPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void doSignup() {
        loginBtn.click();
        emailAddress.sendKeys("nadim@test.com");
        createBtn.click();
        genderTitle.click();
        firstName.sendKeys("Nadim");
        lastName.sendKeys("Mahmud");
        password.sendKeys("Nadim123");

        Select day = new Select(days);
        day.selectByValue("10");

        Select month = new Select(months);
        day.selectByValue("10");

        Select year = new Select(years);
        day.selectByValue("10");

        newsletter.click();
        offer.click();

        firstName2.sendKeys("Nadim");
        lastName2.sendKeys("Mahmud");
        company.sendKeys("SJ Innovation LLC");
        address.sendKeys("1223 Franklee Lane");
        city.sendKeys("Allentown");
        state.sendKeys("PA");
        postcode.sendKeys("18109");

        Select country1 = new Select(country);
        country1.selectByVisibleText("United States");

        information.sendKeys("Additional Information");
        homePhone.sendKeys("484-519-1311");
        mobilePhone.sendKeys("484-519-1312");
        refAddress.sendKeys("New Jersy");
        submitBtn.click();


    }

}
