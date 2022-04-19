package testsuite;

import browsefactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseOrangeUrl = "https://opensource-demo.orangehrmlive.com/";
@Before

    public void setUpOrangeHomepage(){

    openBrowser_Orange(baseOrangeUrl); // opening browser using BaseTest method and passing url as parameter
}
@Test

    public void userShouldLoginSuccessfullyWithValidCredentials(){

    String expectedWelcomeMessage ="Welcome"; // this message is on real website

    WebElement emailId = driver.findElement(By.id("txtUsername"));
    emailId.sendKeys("Admin");
    WebElement emailPassword = driver.findElement(By.id("txtPassword"));
    emailPassword.sendKeys("admin123");
    WebElement loginButton = driver.findElement(By.id("btnLogin"));
    loginButton.click();
    WebElement actualWelcomeMessageElement = driver.findElement(By.id("welcome"));
    //xpath("//a[@id ='welcome']")
    String actualWelcomeMessage = actualWelcomeMessageElement.getText(); // storing actual message retrieved from element
    System.out.println(actualWelcomeMessage);
    //Assert.assertEquals("Find Welcome Message when successfully Login",expectedWelcomeMessage,actualWelcomeMessage);
    Assert.assertTrue("Webpage doesn't contain Welcome message",actualWelcomeMessage.contains("Welcome"));

    driver.quit();// closing all the windows/browsers opened during test

    // Assert.assertTrue will check whether the actualWelcomeMessage retrieved from webpage contains 'Welcome'
    // word or not and if it does than return true and pass the test case otherwise error message will be displayed





   // driver.quit();
}


}
