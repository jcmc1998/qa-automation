import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/JC/Documents/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }

}
