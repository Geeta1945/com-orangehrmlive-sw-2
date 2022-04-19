package browsefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest { // parent class
// loading url and maximize webpage window
    public static WebDriver driver; // public static webdriver variable created so it can be accessed globaly

    public void openBrowser_Orange(String orangeUrl) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // setting up driver properties
        driver = new ChromeDriver(); // creating chrome driver object
        driver.get(orangeUrl);// opening Url received as method parameter
        driver.manage().window().maximize();// maximize window once opened    }

    }
}
