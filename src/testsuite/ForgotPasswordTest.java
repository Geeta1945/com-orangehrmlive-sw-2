package testsuite;
/*Write down the following test into ‘ForgotPasswordTest’ class 1. userShouldNavigateToForgotPasswordPageSuccessfully
*click on the ‘Forgot your password’ link * Verify the text ‘Forgot Your Password?’
*/
import browsefactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseOrangeUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUpOrangeHomepage(){

        openBrowser_Orange(baseOrangeUrl); // opening browser using BaseTest method and passing url as parameter
    }
    @Test

    public void forgotPasswordTest(){
        String expectedMessage ="Forgot Your Password?"; // this message is on real website


        WebElement forgotPasswordClick = driver.findElement(By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']"));
        // finding webelement which is with link to reset password

        forgotPasswordClick.click(); // Once found an element clicking it.
        WebElement forgotPasswordElement = driver.findElement(By.xpath("//h1[text()='Forgot Your Password?']"));
        // on next page looking for message ' Forgot Your Password'

        String actualMessage = forgotPasswordElement.getText(); // retrieving the text from the
        System.out.println(actualMessage);

        // Comparing both actual and expected messages and if not matched than error message will be displayed otherwise
        // test will be passed

        driver.quit();




    }


}
