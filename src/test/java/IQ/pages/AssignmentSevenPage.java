package IQ.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AssignmentSevenPage {
    WebDriver driver;
    String xpath;
    public AssignmentSevenPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "inputEmail")
    public WebElement username;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInBtn;

    @FindBy(id = "inputEmail-error")
    public WebElement message;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksModule;

    @FindBy(xpath = "//span[.='Borrowing Books']")
    public WebElement borrowingBooksModule;

    public void assertTwoModule() {
        Assert.assertTrue(booksModule.isDisplayed());
        Assert.assertTrue(borrowingBooksModule.isDisplayed());

    }
    public void login() {
        username.sendKeys("student3366@library");
        password.sendKeys("MU0rEdlK");
        signInBtn.click();
    }



}
