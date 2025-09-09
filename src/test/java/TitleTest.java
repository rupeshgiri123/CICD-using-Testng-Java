import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TitleTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.edge.driver", "C:\\driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testGoogleHomePage() {
        driver.get("https://www.google.com");
        String pageTitle =  driver.getTitle();
        Assert.assertEquals(pageTitle, "Google", "Title does not match!");
    }

}
