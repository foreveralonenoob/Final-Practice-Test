package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import static Utils.Helper.setDriver;

public class Hook {
    private WebDriver driver;

    @Before
    public void StartingUp() {

        driver = setDriver("Chrome", 10);
        System.out.println("The driver is indeed " + driver + ".");
    }

    public WebDriver getTheDriver(){
        return driver;
    }


/*    @After
    public void TearDown() {
        driver.quit();
    }*/

}
