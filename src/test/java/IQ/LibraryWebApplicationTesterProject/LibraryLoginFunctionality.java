package IQ.LibraryWebApplicationTesterProject;


import IQ.pages.AssignmentSevenPage;
import IQ.pages.ConfigurationReader;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LibraryLoginFunctionality extends TestBase{
    AssignmentSevenPage assignmentSevenPage = new AssignmentSevenPage();
    @Test
    public void loginFunctionalityOfLibrary() {

        driver.get(ConfigurationReader.getProperty("library.url"));

        Assert.assertEquals(driver.getCurrentUrl(),"https://library3.cybertekschool.com/login.html");
        assignmentSevenPage.login();
        assignmentSevenPage.assertTwoModule();


    }
    @Test
    public void invalidLoginCredentials() {
        driver.get(ConfigurationReader.getProperty("library.url"));
        AssignmentSevenPage assignmentSevenPage = new AssignmentSevenPage();

        assignmentSevenPage.username.sendKeys("fiaiejfiajf");

        assignmentSevenPage.password.sendKeys("fljehfhef");

        assignmentSevenPage.signInBtn.click();

        Assert.assertEquals(assignmentSevenPage.message.getText(),"Please enter a valid email address.");

    }

    @Test
    public void loginWithStudentCredintials() {
        driver.get(ConfigurationReader.getProperty("library.url"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://library3.cybertekschool.com/login.html");
        AssignmentSevenPage assignmentSevenPage = new AssignmentSevenPage();
        assignmentSevenPage.username.sendKeys("student3366@library");
        assignmentSevenPage.password.sendKeys("MU0rEdlK");
        assignmentSevenPage.signInBtn.click();



        WebElement users = driver.findElement(By.linkText("Books"));
        Assert.assertTrue(users.isDisplayed());
        WebElement books = driver.findElement(By.linkText("Borrowing Books"));
        Assert.assertTrue(books.isDisplayed());


    }


}
