import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {


    WebDriver driver;

    @Test
    public void getElementTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }
}
