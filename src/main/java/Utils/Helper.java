package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Helper {
    public static WebDriver driver;

    public static WebDriver setDriver(String webDriverName, int timeOutInSeconds){
        if(webDriverName.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver",
                    "F:\\BrowserD\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            System.out.println("Returning a " + driver+ ".");
            return driver;
        }
        else{
            return null;
        }
    }
}
